package com.jiosaavn.models.artists;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.jiosaavn.models.Album;
import java.util.List;

public class ArtistAlbum {

  @JsonIgnoreProperties(ignoreUnknown = true)
  public class ArtistAlbumAPIResponseModel {
    public String artistId;
    public String name;
    public String subtitle;
    public String image;
    public String follower_count;
    public String type;
    public boolean isVerified;
    public String dominantLanguage;
    public String dominantType;

    @JsonProperty("topAlbums")
    public TopAlbums topAlbums;

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class TopAlbums {
      public List<Album.AlbumAPIResponseModel> albums;
      public int total;
    }
  }

  public class ArtistAlbumModel {
    public int total;
    public List<Album.AlbumModel> albums;
  }
}
