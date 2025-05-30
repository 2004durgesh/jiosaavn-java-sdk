package com.jiosaavn.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.jiosaavn.models.artists.Artist;
import com.jiosaavn.models.artists.ArtistMap;

import java.util.List;

public class Album {

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class AlbumAPIResponseModel {

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

        @JsonProperty("list")
        public Object list;

        @JsonProperty("more_info")
        public MoreInfo moreInfo;

        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class MoreInfo {
            @JsonProperty("artistMap")
            public Song.SongAPIResponseModel.ArtistMapWrapper artistMap;

            @JsonProperty("song_count")
            public String songCount;

            @JsonProperty("copyright_text")
            public String copyrightText;

            @JsonProperty("is_dolby_content")
            public boolean isDolbyContent;

            @JsonProperty("label_url")
            public String labelUrl;

        }

    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class AlbumModel {
        public AlbumModel(String id, String name, String url) {
            this.id = id;
            this.name = name;
            this.url = url;
        }

        public String id;
        public String name;
        public String description;
        public Integer year;
        public String type;
        public Integer playCount;
        public String language;
        public boolean explicitContent;
        public Artist artists;
        public Integer songCount;
        public String url;
        public List<DownloadLink> image;
        public List<Song.SongModel> songs;

    }

}