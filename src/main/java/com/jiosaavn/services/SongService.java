package com.jiosaavn.services;

import com.jiosaavn.constants.Endpoints;
import com.jiosaavn.models.BaseService;
import com.jiosaavn.models.Song;
import java.io.IOException;
import java.util.*;
import java.util.regex.*;

/**
 * Service class for interacting with JioSaavn song-related APIs. This class extends {@link
 * BaseService} to inherit common API interaction functionalities.
 */
public class SongService extends BaseService {

  /**
   * Retrieves details of a song by its ID.
   *
   * @param id The unique identifier of the song.
   * @return A list of {@link Song.SongModel} objects containing the song's details. Although
   *     typically one song is returned for a single ID, it's wrapped in a list due to the API
   *     response structure which can handle multiple IDs.
   * @throws IOException If an I/O error occurs during the API call.
   */
  public List<Song.SongModel> getSongById(String id) throws IOException {
    Map<String, String> params = new HashMap<>();
    params.put("pids", id);
    Song.SongResponse response =
        fetchFromApi(Endpoints.Songs.ID, params, Song.SongResponse.class, ApiContext.web6dot0);
    List<Song.SongModel> result = new ArrayList<>();
    for (Song.SongAPIResponseModel song : response.songs) {
      result.add(songPayloadTransformation(song));
    }
    return result;
  }

  /**
   * Retrieves details of a song using its JioSaavn public link. The method extracts the song token
   * from the provided link to make the API call.
   *
   * @param link The full URL of the song on JioSaavn (e.g.,
   *     "https://www.jiosaavn.com/song/o-maahi/BwsYdR1jRHI").
   * @return A list of {@link Song.SongModel} objects containing the song's details.
   * @throws IOException If an I/O error occurs during the API call or if the token cannot be
   *     extracted from the link.
   */
  public List<Song.SongModel> getSongByLink(String link) throws IOException {
    Map<String, String> params = new HashMap<>();
    String regex = "jiosaavn\\.com/song/[^/]+/([^/]+)$";
    Pattern pattern = Pattern.compile(regex);
    Matcher matcher = pattern.matcher(link);
    String token = null;
    if (matcher.find()) {
      token = matcher.group(1); // Capture group 1
      System.out.println(
          "Extracted ID: "); // This line might be for debugging and could be removed in production
    } else {
      System.out.println(
          "No match found."
              + matcher); // This line might be for debugging and could be removed in production
      throw new IOException("Could not extract song token from the provided link: " + link);
    }

    params.put("type", "song");
    params.put("token", token);
    Song.SongResponse response =
        fetchFromApi(Endpoints.Songs.LINK, params, Song.SongResponse.class, ApiContext.web6dot0);
    List<Song.SongModel> result = new ArrayList<>();
    for (Song.SongAPIResponseModel song : response.songs) {
      result.add(songPayloadTransformation(song));
    }
    return result;
  }

  /**
   * Retrieves the lyrics for a specific song by its lyrics ID.
   *
   * @param id The unique identifier for the song's lyrics. This is typically found within the
   *     {@code lyricsId} field of a {@link Song.SongModel}.
   * @return A {@link Song.SongLyrics} object containing the lyrics text and a snippet.
   * @throws IOException If an I/O error occurs during the API call.
   */
  public Song.SongLyrics getLyricsById(String id) throws IOException {
    Map<String, String> params = new HashMap<>();
    params.put("lyrics_id", id);
    Song.SongLyrics response =
        fetchFromApi(Endpoints.Songs.LYRICS, params, Song.SongLyrics.class, ApiContext.web6dot0);
    return response;
  }
}
