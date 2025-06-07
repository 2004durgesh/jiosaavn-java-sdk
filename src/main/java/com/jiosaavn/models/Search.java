package com.jiosaavn.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class Search {

  @JsonIgnoreProperties(ignoreUnknown = true)
  public static class SearchResponseModel<T> {
    @JsonProperty("results")
    public List<T> results;

    @JsonProperty("position")
    public int position;
  }

  public static class SearchApiResponseWrapper
      extends SearchResponseModel<SearchAPIResponseModel> {}

  @JsonIgnoreProperties(ignoreUnknown = true)
  public static class SearchAPIResponseModel {

    @JsonProperty("albums")
    public Data<Albums> albums;

    @JsonProperty("songs")
    public Data<Songs> songs;

    @JsonProperty("playlists")
    public Data<Playlists> playlists;

    @JsonProperty("artists")
    public Data<Artists> artists;

    @JsonProperty("topquery")
    public Data<TopQuery> topQuery;

    public static class Data<T> {
      @JsonProperty("data")
      public List<T> data;

      @JsonProperty("position")
      public int position;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Albums {
      @JsonProperty("id")
      public String id;

      @JsonProperty("title")
      public String title;

      @JsonProperty("subtitle")
      public String subtitle;

      @JsonProperty("type")
      public String type;

      @JsonProperty("image")
      public String image;

      @JsonProperty("perma_url")
      public String permaUrl;

      @JsonProperty("more_info")
      public AlbumMoreInfo moreInfo;

      @JsonProperty("explicit_content")
      public String explicitContent;

      @JsonProperty("mini_obj")
      public boolean miniObj;

      @JsonProperty("description")
      public String description;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class AlbumMoreInfo {
      @JsonProperty("music")
      public String music;

      @JsonProperty("ctr")
      public int ctr;

      @JsonProperty("year")
      public String year;

      @JsonProperty("is_movie")
      public String isMovie;

      @JsonProperty("language")
      public String language;

      @JsonProperty("song_pids")
      public String songPids;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Songs {
      @JsonProperty("id")
      public String id;

      @JsonProperty("title")
      public String title;

      @JsonProperty("subtitle")
      public String subtitle;

      @JsonProperty("type")
      public String type;

      @JsonProperty("image")
      public String image;

      @JsonProperty("perma_url")
      public String permaUrl;

      @JsonProperty("more_info")
      public SongMoreInfo moreInfo;

      @JsonProperty("explicit_content")
      public String explicitContent;

      @JsonProperty("mini_obj")
      public boolean miniObj;

      @JsonProperty("description")
      public String description;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class SongMoreInfo {
      @JsonProperty("album")
      public String album;

      @JsonProperty("ctr")
      public int ctr;

      @JsonProperty("score")
      public String score; // Optional in Zod

      @JsonProperty("vcode")
      public String vcode;

      @JsonProperty("vlink")
      public String vlink; // Optional in Zod

      @JsonProperty("primary_artists")
      public String primaryArtists;

      @JsonProperty("singers")
      public String singers;

      @JsonProperty("video_available")
      public boolean videoAvailable;

      @JsonProperty("triller_available")
      public boolean trillerAvailable;

      @JsonProperty("language")
      public String language;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Playlists {
      @JsonProperty("id")
      public String id;

      @JsonProperty("title")
      public String title;

      @JsonProperty("subtitle")
      public String subtitle;

      @JsonProperty("type")
      public String type;

      @JsonProperty("image")
      public String image;

      @JsonProperty("perma_url")
      public String permaUrl;

      @JsonProperty("more_info")
      public PlaylistMoreInfo moreInfo;

      @JsonProperty("explicit_content")
      public String explicitContent;

      @JsonProperty("mini_obj")
      public boolean miniObj;

      @JsonProperty("description")
      public String description;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class PlaylistMoreInfo {
      @JsonProperty("firstname")
      public String firstname;

      @JsonProperty("artist_name")
      public List<String> artistName;

      @JsonProperty("entity_type")
      public String entityType;

      @JsonProperty("entity_sub_type")
      public String entitySubType;

      @JsonProperty("video_available")
      public boolean videoAvailable;

      @JsonProperty("is_dolby_content")
      public boolean isDolbyContent;

      @JsonProperty("sub_types")
      public Object subTypes; // z.any() in Zod

      @JsonProperty("images")
      public Object images; // z.any() in Zod

      @JsonProperty("lastname")
      public String lastname;

      @JsonProperty("language")
      public String language;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Artists {
      @JsonProperty("id")
      public String id;

      @JsonProperty("title")
      public String title;

      @JsonProperty("image")
      public String image;

      @JsonProperty("extra")
      public String extra;

      @JsonProperty("type")
      public String type;

      @JsonProperty("mini_obj")
      public boolean miniObj;

      @JsonProperty("isRadioPresent")
      public boolean isRadioPresent;

      @JsonProperty("ctr")
      public int ctr;

      @JsonProperty("entity")
      public int entity;

      @JsonProperty("description")
      public String description;

      @JsonProperty("position")
      public int position;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class TopQuery {
      @JsonProperty("id")
      public String id;

      @JsonProperty("title")
      public String title;

      @JsonProperty("subtitle")
      public String subtitle;

      @JsonProperty("type")
      public String type;

      @JsonProperty("image")
      public String image;

      @JsonProperty("perma_url")
      public String permaUrl;

      @JsonProperty("more_info")
      public TopQueryMoreInfo moreInfo;

      @JsonProperty("explicit_content")
      public String explicitContent; // Optional in Zod

      @JsonProperty("mini_obj")
      public boolean miniObj;

      @JsonProperty("description")
      public String description;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class TopQueryMoreInfo {
      @JsonProperty("album")
      public String album;

      @JsonProperty("ctr")
      public int ctr;

      @JsonProperty("score")
      public String score; // Optional in Zod

      @JsonProperty("vcode")
      public String vcode;

      @JsonProperty("vlink")
      public String vlink;

      @JsonProperty("primary_artists")
      public String primaryArtists;

      @JsonProperty("singers")
      public String singers;

      @JsonProperty("video_available")
      public boolean videoAvailable;

      @JsonProperty("triller_available")
      public boolean trillerAvailable;

      @JsonProperty("language")
      public String language;
    }
  }

  @JsonIgnoreProperties(ignoreUnknown = true)
  public static class SearchModel {

    @JsonProperty("albums")
    public SearchResponseModel<Album> albums;

    @JsonProperty("songs")
    public SearchResponseModel<Song> songs;

    @JsonProperty("artists")
    public SearchResponseModel<Artist> artists;

    @JsonProperty("playlists")
    public SearchResponseModel<Playlist> playlists;

    @JsonProperty("topQuery")
    public SearchResponseModel<TopQueryItem> topQuery;

    public static class Album {
      @JsonProperty("id")
      public String id;

      @JsonProperty("title")
      public String title;

      @JsonProperty("image")
      public List<DownloadLink> image;

      @JsonProperty("artist")
      public String artist;

      @JsonProperty("url")
      public String url;

      @JsonProperty("type")
      public String type;

      @JsonProperty("description")
      public String description;

      @JsonProperty("year")
      public String year;

      @JsonProperty("language")
      public String language;

      @JsonProperty("songIds")
      public String songIds;
    }

    public static class Song {
      @JsonProperty("id")
      public String id;

      @JsonProperty("title")
      public String title;

      @JsonProperty("image")
      public List<DownloadLink> image;

      @JsonProperty("album")
      public String album;

      @JsonProperty("url")
      public String url;

      @JsonProperty("type")
      public String type;

      @JsonProperty("description")
      public String description;

      @JsonProperty("primary_artists")
      public String primaryArtists;

      @JsonProperty("language")
      public String language;

      @JsonProperty("singers")
      public String singers;
    }

    public static class Artist {
      @JsonProperty("id")
      public String id;

      @JsonProperty("title")
      public String title;

      @JsonProperty("image")
      public List<DownloadLink> image;

      @JsonProperty("type")
      public String type;

      @JsonProperty("description")
      public String description;

      @JsonProperty("position")
      public String position;
    }

    public static class Playlist {
      @JsonProperty("id")
      public String id;

      @JsonProperty("title")
      public String title;

      @JsonProperty("image")
      public List<DownloadLink> image;

      @JsonProperty("url")
      public String url;

      @JsonProperty("type")
      public String type;

      @JsonProperty("description")
      public String description;

      @JsonProperty("language")
      public String language;
    }

    public static class TopQueryItem {
      @JsonProperty("id")
      public String id;

      @JsonProperty("title")
      public String title;

      @JsonProperty("image")
      public List<DownloadLink> image;

      @JsonProperty("album")
      public String album;

      @JsonProperty("url")
      public String url;

      @JsonProperty("type")
      public String type;

      @JsonProperty("description")
      public String description;

      @JsonProperty("primary_artists")
      public String primaryArtists;

      @JsonProperty("language")
      public String language;

      @JsonProperty("singers")
      public String singers;
    }
  }
}
