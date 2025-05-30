package com.jiosaavn.models.artists;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.jiosaavn.models.DownloadLink;

import java.util.List;

public class ArtistMap {

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class ArtistMapAPIResponseModel {
        public String id;
        public String name;
        public String role;
        public String type;
        public String image;
        @JsonProperty("perma_url")
        public String permaUrl;

    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class ArtistMapModel {
        public String id;
        public String name;
        public String role;
        public String type;
        public List<DownloadLink> image;
        public String url;
    }
}