package com.jiosaavn.models.artists;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.jiosaavn.models.Song;

import java.util.List;

public class ArtistSong {

    @JsonIgnoreProperties(ignoreUnknown = true)
    public class ArtistSongAPIResponseModel {
        public String artistId;
        public String name;
        public String subtitle;
        public String image;
        public String follower_count;
        public String type;
        public boolean isVerified;
        public String dominantLanguage;
        public String dominantType;

        @JsonProperty("topSongs")
        public TopSongs topSongs;

        // Inner class for topSongs object
        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class TopSongs {
            public List<Song.SongAPIResponseModel> songs;
            public int total;
        }
    }

    public class ArtistSongModel {
        public int total;
        public List<Song.SongModel> songs;
    }


}
