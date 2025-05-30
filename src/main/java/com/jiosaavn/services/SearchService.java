package com.jiosaavn.services;

import com.jiosaavn.constants.Endpoints;
import com.jiosaavn.models.BaseService;
import com.jiosaavn.models.Search;
import com.jiosaavn.utils.Utils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SearchService extends BaseService {

    protected Search.SearchModel searchArrayTransformation(Search.SearchAPIResponseModel search) {
        Search.SearchModel model = new Search.SearchModel();
        System.out.println("---------------"+search);
        // Transform TopQuery
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

    public List<Search.SearchModel> search(String query) throws IOException {
        Map<String, String> params = new HashMap<>();
        params.put("query", query);
        Search.SearchAPIResponseModel response = fetchFromApi(
                Endpoints.Search.ALL,
                params,
                Search.SearchAPIResponseModel.class,  // Changed from SearchApiResponseWrapper
                ApiContext.web6dot0
        );

        List<Search.SearchModel> result = new ArrayList<>();
        result.add(searchArrayTransformation(response));  // Process single response
        return result;
    }
}