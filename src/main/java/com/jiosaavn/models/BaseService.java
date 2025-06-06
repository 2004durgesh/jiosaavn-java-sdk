package com.jiosaavn.models;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jiosaavn.constants.UserAgents;
import com.jiosaavn.models.artists.Artist;
import com.jiosaavn.models.artists.ArtistMap;
import com.jiosaavn.utils.JsonUtils;
import com.jiosaavn.utils.Utils;
import okhttp3.*;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class BaseService {

    private static final String BASE_URL = "https://www.jiosaavn.com/api.php";
    private static final String CDN_URL = "https://c.saavncdn.com/";

    protected final OkHttpClient httpClient;
    protected final ObjectMapper objectMapper;

    public enum ApiContext {
        web6dot0,
        android,
        ios
    }

    public BaseService() {
        this.httpClient = new OkHttpClient.Builder()
                .connectTimeout(30, TimeUnit.SECONDS)
                .readTimeout(30, TimeUnit.SECONDS)
                .addInterceptor(this::addHeaders)
                .build();

        this.objectMapper = new ObjectMapper();
    }

    private Response addHeaders(Interceptor.Chain chain) throws IOException {
        String randomUA = UserAgents.USER_AGENTS.get(new Random().nextInt(UserAgents.USER_AGENTS.size()));
        Request original = chain.request();
        Request request = original.newBuilder()
                .header("User-Agent", randomUA)
                .header("Accept", "application/json, text/plain, */*")
                .header("Accept-Language", "en-US,en;q=0.9")
                .header("Referer", "https://www.jiosaavn.com/")
                .header("Origin", "https://www.jiosaavn.com")
                .build();

        // Print request headers
        System.out.println("Request Headers:");
        for (String name : request.headers().names()) {
            System.out.println(name + ": " + request.header(name));
        }
        return chain.proceed(request);
    }

    protected <T> T fetchFromApi(
            String endpoint,
            Map<String, String> queryParams,
            Class<T> responseType,
            ApiContext context
    ) throws IOException {
        HttpUrl.Builder urlBuilder = HttpUrl.parse(BASE_URL).newBuilder();
        urlBuilder.addQueryParameter("__call", endpoint);
        urlBuilder.addQueryParameter("_format", "json");
        urlBuilder.addQueryParameter("_marker", "0");
        urlBuilder.addQueryParameter("api_version", "4");
        urlBuilder.addQueryParameter("ctx", context != null ? context.name() : "web6dot0");

        for (Map.Entry<String, String> entry : queryParams.entrySet()) {
            urlBuilder.addQueryParameter(entry.getKey(), entry.getValue());
        }

        HttpUrl finalUrl = urlBuilder.build();
        System.out.println("Request URL: " + finalUrl);


        Request request = new Request.Builder()
                .url(urlBuilder.build())
                .get()
                .build();

        try (Response response = httpClient.newCall(request).execute()) {
            if (!response.isSuccessful()) {
                throw new IOException("Request failed: " + response.code() + " - " + response.message());
            }
//            System.out.println(response.body().string());
            return objectMapper.readValue(response.body().string(), responseType);
        }
    }

    protected Artist.ArtistModel artistPayloadTransformation(Artist.ArtistAPIResponseModel artist) throws JsonProcessingException {
        Artist.ArtistModel model = new Artist.ArtistModel();
        List<Song.SongModel> topSongList = new ArrayList<>();
        List<Artist.ArtistModel.SimilarArtist> similarList = new ArrayList<>();
        List<Album.AlbumModel> topAlbumList = new ArrayList<>();
        List<Song.SongModel> singlesList = new ArrayList<>();

        model.id = artist.artistId;
        model.name = artist.name;
        model.url = artist.permaUrl != null ? artist.permaUrl : artist.urls != null ? artist.urls.overview : null;
        model.type = artist.type;
        try {
            model.followerCount = artist.follower_count != null ? Integer.parseInt(artist.follower_count) : 0;
        } catch (NumberFormatException e) {
            model.followerCount = 0;
        }
        model.isVerified = artist.isVerified;
        model.dominantLanguage = artist.dominantLanguage;

        model.bio = artist.bio != null
                ? JsonUtils.parse(artist.bio, new TypeReference<List<Artist.ArtistModel.BioEntry>>() {
        })
                : null;
        model.fb = artist.fb;
        model.dob = artist.dob;
        model.twitter = artist.twitter;
        model.wiki = artist.wiki;
        model.availableLanguages = artist.availableLanguages;
        model.isRadioPresent = artist.isRadioPresent;
        model.image = Utils.createImageLinks(artist.image);

        if (artist.topSongs != null) {
            for (Song.SongAPIResponseModel song : artist.topSongs) {
                topSongList.add(songPayloadTransformation(song));
            }
            model.topSongs = topSongList;
        } else {
            model.topSongs = null;
        }

        if (artist.singles != null) {
            for (Song.SongAPIResponseModel song : artist.singles) {
                singlesList.add(songPayloadTransformation(song));
            }
            model.singles = singlesList;
        }

        if (artist.topAlbums != null) {
            for (Album.AlbumAPIResponseModel album : artist.topAlbums) {
                topAlbumList.add(albumPayloadTransformation(album));
            }
            model.topAlbums = topAlbumList;
        }

        if (artist.similarArtists != null) {
            for (Artist.ArtistAPIResponseModel.SimilarArtist sa : artist.similarArtists) {
                Artist.ArtistModel.SimilarArtist similar = new Artist.ArtistModel.SimilarArtist();
                similar.id = sa.id;
                similar.name = sa.name;
                similar.url = sa.permaUrl;
                similar.image = Utils.createImageLinks(sa.image_url);
                similar.languages = sa.languages != null
                        ? JsonUtils.parse(sa.languages, new TypeReference<Map<String, String>>() {
                })
                        : null;
                similar.wiki = sa.wiki;
                similar.dob = sa.dob;
                similar.fb = sa.fb;
                similar.twitter = sa.twitter;
                similar.isRadioPresent = sa.isRadioPresent;
                similar.type = sa.type;
                similar.dominantType = sa.dominantType;
                similar.aka = sa.aka;
                similar.bio = sa.bio != null
                        ? JsonUtils.parse(sa.bio, new TypeReference<String>() {
                })
                        : null;

                similarList.add(similar);
            }
            model.similarArtists = similarList;
        } else {
            model.similarArtists = null;
        }

        return model;
    }

    protected ArtistMap.ArtistMapModel artistMapPayloadTransformation(ArtistMap.ArtistMapAPIResponseModel artist) {
        ArtistMap.ArtistMapModel model = new ArtistMap.ArtistMapModel();
        model.id = artist.id;
        model.name = artist.name;
        model.role = artist.role;
        model.type = artist.type;
        model.url = artist.permaUrl;
        model.image = Utils.createImageLinks(artist.image);

        return model;
    }

    protected Song.SongModel songPayloadTransformation(@NotNull Song.SongAPIResponseModel song) {
        Song.SongModel model = new Song.SongModel();

        model.id = song.id;
        model.name = song.title;
        model.type = song.type;
        model.year = song.year;
        model.releaseDate = song.year;
        if (song.moreInfo.duration != null && !song.moreInfo.duration.isEmpty()) {
            model.duration = Integer.parseInt(song.moreInfo.duration);
        }
        model.label = song.moreInfo.label;
        model.explicitContent = Boolean.parseBoolean(song.explicitContent);
        if (song.playCount != null && !song.playCount.trim().isEmpty()) {
            try {
                model.playCount = Integer.parseInt(song.playCount.trim());
            } catch (NumberFormatException e) {
                model.playCount = 0;
            }
        } else {
            model.playCount = 0;
        }

        model.language = song.language;
        model.hasLyrics = Boolean.parseBoolean(song.moreInfo.hasLyrics);
        if (song.moreInfo.lyricsId != null && !song.moreInfo.lyricsId.isEmpty()) {
            model.lyricsId = song.moreInfo.lyricsId;
        } else {
            model.lyricsId = song.id;
        }
        model.url = song.permaUrl;
        model.copyright = song.moreInfo.copyrightText;

        model.album = new Song.SongModel.SongModelAlbum();
        model.album.id = song.moreInfo.albumId;
        model.album.name = song.moreInfo.album;
        model.album.url = song.moreInfo.albumUrl;
        model.artists = new Song.SongModel.SongModelArtist();
        model.artists.primaryArtists = transformArtists(song.moreInfo.artistMap.primaryArtists);
        model.artists.featuredArtists = transformArtists(song.moreInfo.artistMap.featuredArtists);
        model.artists.all = transformArtists(song.moreInfo.artistMap.all);
        model.image = Utils.createImageLinks(song.image);
        model.downloadUrl = Utils.createDownloadUrl(song.moreInfo.encryptedMediaUrl);
        return model;
    }

    protected Playlist.PlaylistModel playlistPayLoadTransformation(Playlist.PlaylistAPIResponseModel playlist) {
        Playlist.PlaylistModel model = new Playlist.PlaylistModel();
        List<Song.SongModel> songs = new ArrayList<>();
        List<ArtistMap.ArtistMapModel> artists = new ArrayList<>();

        model.id = playlist.id;
        model.name = playlist.title;
        model.description = playlist.headerDesc;
        model.type = playlist.type;
        if (playlist.year != null && !playlist.year.isEmpty()) {
            model.year = Integer.parseInt(playlist.year);
        }
        if (playlist.playCount != null && !playlist.playCount.isEmpty()) {
            model.playCount = Integer.parseInt(playlist.playCount);
        }
        if (playlist.listCount != null && !playlist.listCount.isEmpty()) {
            model.songCount = Integer.parseInt(playlist.listCount);
        }
        model.language = playlist.language;
        model.explicitContent = Boolean.parseBoolean(playlist.explicitContent);
        model.url = playlist.permaUrl;
        model.image = Utils.createImageLinks(playlist.image);
        if (playlist.list != null && !playlist.list.isEmpty()) {
            for (Song.SongAPIResponseModel song : playlist.list) {
                songs.add(songPayloadTransformation(song));
            }
            model.songs = songs;
        } else {
            model.songs = null;
        }
        if (playlist.moreInfo.artists != null && !playlist.moreInfo.artists.isEmpty()) {
            for (ArtistMap.ArtistMapAPIResponseModel artist : playlist.moreInfo.artists) {
                artists.add(artistMapPayloadTransformation(artist));
            }
            model.artists = Utils.uniqueById(artists);
        } else {
            model.artists = null;
        }

        return model;
    }

    protected Search.SearchModel searchPayloadTransformation(Search.SearchAPIResponseModel search) {
        Search.SearchModel model = new Search.SearchModel();
        if (search.topQuery != null) {
            Search.SearchResponseModel<Search.SearchModel.TopQueryItem> topQuerySection = new Search.SearchResponseModel<>();
            if (search.topQuery.data != null) {
                List<Search.SearchModel.TopQueryItem> topQueryResults = new ArrayList<>();
                for (Search.SearchAPIResponseModel.TopQuery item : search.topQuery.data) {
                    Search.SearchModel.TopQueryItem result = new Search.SearchModel.TopQueryItem();
                    result.id = item.id;
                    result.title = item.title;
                    result.image = Utils.createImageLinks(item.image);
                    result.album = item.moreInfo != null ? item.moreInfo.album : null;
                    result.url = item.permaUrl;
                    result.type = item.type;
                    result.language = item.moreInfo != null ? item.moreInfo.language : null;
                    result.description = item.description;
                    result.primaryArtists = item.moreInfo != null ? item.moreInfo.primaryArtists : null;
                    result.singers = item.moreInfo != null ? item.moreInfo.singers : null;

                    topQueryResults.add(result);
                }
                topQuerySection.results = topQueryResults;
            }
            topQuerySection.position = search.topQuery.position;
            model.topQuery = topQuerySection;
        }

        // Transform Songs
        if (search.songs != null) {
            Search.SearchResponseModel<Search.SearchModel.Song> songsSection = new Search.SearchResponseModel<>();
            if (search.songs.data != null) {
                List<Search.SearchModel.Song> songResults = new ArrayList<>();
                for (Search.SearchAPIResponseModel.Songs song : search.songs.data) {
                    Search.SearchModel.Song result = new Search.SearchModel.Song();
                    result.id = song.id;
                    result.title = song.title;
                    result.image = Utils.createImageLinks(song.image);
                    result.album = song.moreInfo != null ? song.moreInfo.album : null;
                    result.url = song.permaUrl;
                    result.type = song.type;
                    result.description = song.description;
                    result.primaryArtists = song.moreInfo != null ? song.moreInfo.primaryArtists : null;
                    result.singers = song.moreInfo != null ? song.moreInfo.singers : null;
                    result.language = song.moreInfo != null ? song.moreInfo.language : null;

                    songResults.add(result);
                }
                songsSection.results = songResults;
            }
            songsSection.position = search.songs.position;
            model.songs = songsSection;
        }

        // Transform Albums
        if (search.albums != null) {
            Search.SearchResponseModel<Search.SearchModel.Album> albumsSection = new Search.SearchResponseModel<>();
            if (search.albums.data != null) {
                List<Search.SearchModel.Album> albumResults = new ArrayList<>();
                for (Search.SearchAPIResponseModel.Albums album : search.albums.data) {
                    Search.SearchModel.Album result = new Search.SearchModel.Album();
                    result.id = album.id;
                    result.title = album.title;
                    result.image = Utils.createImageLinks(album.image);
                    result.artist = album.moreInfo != null ? album.moreInfo.music : null;
                    result.url = album.permaUrl;
                    result.type = album.type;
                    result.description = album.description;
                    result.year = album.moreInfo != null ? album.moreInfo.year : null;
                    result.songIds = album.moreInfo != null ? album.moreInfo.songPids : null;
                    result.language = album.moreInfo != null ? album.moreInfo.language : null;

                    albumResults.add(result);
                }
                albumsSection.results = albumResults;
            }
            albumsSection.position = search.albums.position;
            model.albums = albumsSection;
        }

        // Transform Artists
        if (search.artists != null) {
            Search.SearchResponseModel<Search.SearchModel.Artist> artistsSection = new Search.SearchResponseModel<>();
            if (search.artists.data != null) {
                List<Search.SearchModel.Artist> artistResults = new ArrayList<>();
                for (Search.SearchAPIResponseModel.Artists artist : search.artists.data) {
                    Search.SearchModel.Artist result = new Search.SearchModel.Artist();
                    result.id = artist.id;
                    result.title = artist.title;
                    result.image = Utils.createImageLinks(artist.image);
                    result.type = artist.type;
                    result.description = artist.description;
                    result.position = String.valueOf(artist.position); // Convert int to String

                    artistResults.add(result);
                }
                artistsSection.results = artistResults;
            }
            artistsSection.position = search.artists.position;
            model.artists = artistsSection;
        }

        // Transform Playlists
        if (search.playlists != null) {
            Search.SearchResponseModel<Search.SearchModel.Playlist> playlistsSection = new Search.SearchResponseModel<>();
            if (search.playlists.data != null) {
                List<Search.SearchModel.Playlist> playlistResults = new ArrayList<>();
                for (Search.SearchAPIResponseModel.Playlists playlist : search.playlists.data) {
                    Search.SearchModel.Playlist result = new Search.SearchModel.Playlist();
                    result.id = playlist.id;
                    result.title = playlist.title;
                    result.image = Utils.createImageLinks(playlist.image);
                    result.url = playlist.permaUrl;
                    result.type = playlist.type;
                    result.language = playlist.moreInfo != null ? playlist.moreInfo.language : null;
                    result.description = playlist.description;

                    playlistResults.add(result);
                }
                playlistsSection.results = playlistResults;
            }
            playlistsSection.position = search.playlists.position;
            model.playlists = playlistsSection;
        }

        return model;
    }

    private List<ArtistMap.ArtistMapModel> transformArtists(List<ArtistMap.ArtistMapAPIResponseModel> sourceList) {
        if (sourceList == null) return null;

        List<ArtistMap.ArtistMapModel> result = new ArrayList<>();
        for (ArtistMap.ArtistMapAPIResponseModel artist : sourceList) {
            result.add(artistMapPayloadTransformation(artist));
        }
        return result;
    }

    protected Album.AlbumModel albumPayloadTransformation(Album.AlbumAPIResponseModel album) throws JsonProcessingException {
        Album.AlbumModel model = new Album.AlbumModel();
        List<Song.SongModel> songs = new ArrayList<>();
        Song.SongModel.SongModelArtist artists = new Song.SongModel.SongModelArtist();

        model.id = album.id;
        model.name = album.title;
        model.description = album.headerDesc;
        model.type = album.type;
        if (album.year != null && !album.year.isEmpty()) {
            model.year = Integer.parseInt(album.year);
        }
        if (album.playCount != null && !album.playCount.isEmpty()) {
            model.playCount = Integer.parseInt(album.playCount);
        }
        model.language = album.language;
        model.explicitContent = Boolean.parseBoolean(album.explicitContent);
        model.url = album.permaUrl;
        if (album.moreInfo.songCount != null && !album.moreInfo.songCount.isEmpty()) {
            model.songCount = Integer.parseInt(album.moreInfo.songCount);
        }
        model.image = Utils.createImageLinks(album.image);
        if (album.list != null && album.list.isArray()) {
            for (JsonNode songNode : album.list) {
                Song.SongAPIResponseModel song = objectMapper.treeToValue(songNode, Song.SongAPIResponseModel.class);
                songs.add(songPayloadTransformation(song));
            }
            model.songs = songs;
        } else {
            model.songs = null;
        }

        artists.primaryArtists = transformArtists(album.moreInfo.artistMap.primaryArtists);
        artists.featuredArtists = transformArtists(album.moreInfo.artistMap.featuredArtists);
        artists.all = transformArtists(album.moreInfo.artistMap.all);

        model.artists = artists;

        return model;
    }

}
