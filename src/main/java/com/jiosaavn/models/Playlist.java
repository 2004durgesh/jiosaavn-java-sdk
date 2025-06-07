package com.jiosaavn.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.jiosaavn.models.artists.ArtistMap;
import java.util.List;

public class Playlist {

  @JsonIgnoreProperties(ignoreUnknown = true)
  public static class PlaylistAPIResponseModel {

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
    public List<Song.SongAPIResponseModel> list;

    @JsonProperty("more_info")
    public MoreInfo moreInfo;

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class MoreInfo {

      @JsonProperty("uid")
      public String uid;

      @JsonProperty("is_dolby_content")
      public boolean isDolbyContent;

      @JsonProperty("subtype")
      public List<String> subtype;

      @JsonProperty("last_updated")
      public String lastUpdated;

      @JsonProperty("username")
      public String username;

      @JsonProperty("firstname")
      public String firstname;

      @JsonProperty("lastname")
      public String lastname;

      @JsonProperty("is_followed")
      public String isFollowed;

      @JsonProperty("isFY")
      public boolean isFY;

      @JsonProperty("follower_count")
      public String followerCount;

      @JsonProperty("fan_count")
      public String fanCount;

      @JsonProperty("playlist_type")
      public String playlistType;

      @JsonProperty("share")
      public String share;

      @JsonProperty("sub_types")
      public List<String> subTypes;

      @JsonProperty("images")
      public List<String> images;

      @JsonProperty("H2")
      public String h2;

      @JsonProperty("subheading")
      public String subheading;

      @JsonProperty("video_count")
      public String videoCount;

      @JsonProperty("artists")
      public List<ArtistMap.ArtistMapAPIResponseModel> artists;
    }
  }

  @JsonIgnoreProperties(ignoreUnknown = true)
  public static class PlaylistModel {
    public String id;
    public String name;
    public String description;
    public Integer year;
    public String type;
    public Integer playCount;
    public String language;
    public boolean explicitContent;
    public List<ArtistMap.ArtistMapModel> artists;
    public Integer songCount;
    public String url;
    public List<DownloadLink> image;
    public List<Song.SongModel> songs;
  }
}
