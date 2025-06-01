package com.jiosaavn.models.artists;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.jiosaavn.models.Album;
import com.jiosaavn.models.DownloadLink;
import com.jiosaavn.models.Song;

import java.util.List;
import java.util.Map;

public class Artist {

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class ArtistAPIResponseModel {
        public String artistId;
        public String name;
        public String subtitle;
        public String image;
        public String follower_count;
        public String type;
        public boolean isVerified;
        public String dominantLanguage;
        public String dominantType;

        public List<Song.SongAPIResponseModel> topSongs;
        public List<Album.AlbumAPIResponseModel> topAlbums;
        public List<Song.SongAPIResponseModel> singles;

        @JsonProperty("dedicated_artist_playlist")
        public List<Playlist> dedicatedArtistPlaylist;

        @JsonProperty("featured_artist_playlist")
        public List<Playlist> featuredArtistPlaylist;

        public List<SimilarArtist> similarArtists;

        public boolean isRadioPresent;
        public String bio;
        public String dob;
        public String fb;
        public String twitter;
        public String wiki;

        public Urls urls;
        public List<String> availableLanguages;
        public List<Object> topEpisodes; // as z.any() in zod

        public boolean is_followed;

        public String id;
        @JsonProperty("perma_url")
        public String permaUrl;


        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class Playlist {
            public String id;
            public String title;
            public String subtitle;
            public String type;
            public String image;
            @JsonProperty("perma_url")
            public String permaUrl;
            @JsonProperty("more_info")
            public MoreInfo moreInfo;
            public String explicit_content;
            public boolean mini_obj;
            public int numsongs;

        }

        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class MoreInfo {
            public String uid;
            public String firstname;
            public List<String> artist_name;
            public String entity_type;
            public String entity_sub_type;
            public boolean video_available;
            public Object is_dolby_content;
            public Object sub_types;
            public Object images;
            public String lastname;
            public String song_count;
            public String language;

        }

        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class SimilarArtist {
            public String _id;
            public String similar;
            public String languages;
            public String isVerified;
            public String image_url;
            public String wiki;
            public String roles;
            public int combine_artist_pages;
            public boolean webp;
            public String search_keywords;
            public int replace_with_primary_artists;
            public String twitter;
            public String dob;
            public String aka;
            public String name;
            public String primary_artist_id;
            public String id;
            public String fb;
            public String bio;
            @JsonProperty("perma_url")
            public String permaUrl;
            public String type;
            public boolean mini_obj;
            public boolean isRadioPresent;
            public String dominantType;

        }

        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class Urls {
            public String albums;
            public String bio;
            public String comments;
            public String songs;
            public String overview;

        }
    }

    public static class ArtistModel {
        public String id;
        public String name;
        public String url;
        public String type;
        public List<DownloadLink> image;
        public Integer followerCount; // nullable
        public String fanCount; // nullable
        public Boolean isVerified; // nullable
        public String dominantLanguage; // nullable
        public String dominantType; // nullable

        public List<BioEntry> bio; // nullable
        public String dob; // nullable
        public String fb; // nullable
        public String twitter; // nullable
        public String wiki; // nullable
        public List<String> availableLanguages;
        public Boolean isRadioPresent; // nullable

        public List<Song.SongModel> topSongs; // nullable
        public List<Album.AlbumModel> topAlbums; // nullable
        public List<Song.SongModel> singles; // nullable

        public List<SimilarArtist> similarArtists; // nullable


        public static class BioEntry {
            public String text;
            public String title;
            public Integer sequence;

        }

        public static class SimilarArtist {
            public String id;
            public String name;
            public String url;
            public List<DownloadLink> image;
            public Map<String, String> languages; // nullable
            public String wiki;
            public String dob;
            public String fb;
            public String twitter;
            public Boolean isRadioPresent;
            public String type;
            public String dominantType;
            public String aka;
            public String bio; // nullable
        }
    }

}
