package com.jiosaavn.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.jiosaavn.models.artists.ArtistMap;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Song {

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class SongResponse {
        @JsonProperty("songs")
        public List<Song.SongAPIResponseModel> songs;

    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class SongAPIResponseModel {
        public String id;
        public String title;
        public String subtitle;

        @JsonProperty("header_desc")
        public String headerDesc;

        public String type;

        @JsonProperty("perma_url")
        public String permaUrl;

        public String image;
        public String language;
        public String year;

        @JsonProperty("play_count")
        public String playCount;

        @JsonProperty("explicit_content")
        public String explicitContent;

        @JsonProperty("list_count")
        public String listCount;

        @JsonProperty("list_type")
        public String listType;

        public String list;

        @JsonProperty("more_info")
        public MoreInfo moreInfo;

        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class MoreInfo {
            public String music;

            @JsonProperty("album_id")
            public String albumId;

            public String album;
            public String label;
            public String origin;

            @JsonProperty("is_dolby_content")
            public boolean isDolbyContent;

            @JsonProperty("320kbps")
            public String kbps320;

            @JsonProperty("encrypted_media_url")
            public String encryptedMediaUrl;

            @JsonProperty("encrypted_cache_url")
            public String encryptedCacheUrl;

            @JsonProperty("encrypted_drm_cache_url")
            public String encryptedDrmCacheUrl;

            @JsonProperty("encrypted_drm_media_url")
            public String encryptedDrmMediaUrl;

            @JsonProperty("album_url")
            public String albumUrl;

            public String duration;

            @JsonProperty("cache_state")
            public String cacheState;

            @JsonProperty("has_lyrics")
            public String hasLyrics;

            @JsonProperty("lyrics_snippet")
            public String lyricsSnippet;

            public String starred;

            @JsonProperty("copyright_text")
            public String copyrightText;

            @JsonProperty("artistMap")
            public ArtistMapWrapper artistMap;

            @JsonProperty("release_date")
            public String releaseDate;

            @JsonProperty("label_url")
            public String labelUrl;

            public String vcode;
            public String vlink;

            @JsonProperty("triller_available")
            public boolean trillerAvailable;

            @JsonProperty("request_jiotune_flag")
            public boolean requestJioTuneFlag;

            public String webp;

            @JsonProperty("lyrics_id")
            public String lyricsId;
        }

        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class ArtistMapWrapper {

            @JsonProperty("primary_artists")
            public List<ArtistMap.ArtistMapAPIResponseModel> primaryArtists;

            @JsonProperty("featured_artists")
            public List<ArtistMap.ArtistMapAPIResponseModel> featuredArtists;

            @JsonProperty("artists")
            public List<ArtistMap.ArtistMapAPIResponseModel> all;
        }



    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class SongModel {

        public String id;
        public String name;
        public String type;
        public String year; // Nullable
        public String releaseDate; // Nullable
        public Integer duration; // Nullable
        public String label; // Nullable
        public boolean explicitContent;
        public Integer playCount; // Nullable
        public String language;
        public boolean hasLyrics;
        public String lyricsId; // Nullable
        public String url;
        public String copyright;

        public SongModelAlbum album;
        public SongModelArtist artists;
        public List<DownloadLink> image;
        public List<DownloadLink> downloadUrl;

        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class SongModelAlbum{
            public String id;
            public String name;
            public String url;
        }

        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class SongModelArtist{
            @JsonProperty("primary_artists")
            public List<ArtistMap.ArtistMapModel> primaryArtists;

            @JsonProperty("featured_artists")
            public List<ArtistMap.ArtistMapModel> featuredArtists;

            @JsonProperty("artists")
            public List<ArtistMap.ArtistMapModel> all;
        }

    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class SongLyrics{
        @JsonProperty("lyrics")
        public String lyrics;

        @JsonProperty("snippet")
        public String snippet;
    }

}
