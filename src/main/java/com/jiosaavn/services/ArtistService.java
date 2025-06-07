package com.jiosaavn.services;

import com.jiosaavn.constants.Endpoints;
import com.jiosaavn.models.BaseService;
import com.jiosaavn.models.artists.Artist;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Service class for interacting with JioSaavn artist-related APIs. This class extends {@link
 * BaseService} to inherit common API interaction functionalities.
 */
public class ArtistService extends BaseService {

  /** Defines the available sorting criteria for artist content. */
  public enum SortBy {
    /** Sort by popularity. */
    POPULARITY,
    /** Sort by latest releases. */
    LATEST,
    /** Sort alphabetically. */
    ALPHABETICAL
  }

  /** Defines the available sorting order. */
  public enum SortOrder {
    /** Ascending order. */
    ASC,
    /** Descending order. */
    DESC
  }

  /**
   * Retrieves details of an artist by their ID, using default pagination and sorting. Defaults to
   * page 0, 50 songs, 50 albums, sorted by popularity in ascending order.
   *
   * @param id The unique identifier of the artist.
   * @return An {@link Artist.ArtistModel} object containing the artist's details.
   * @throws IOException If an I/O error occurs during the API call.
   */
  public Artist.ArtistModel getArtistById(String id) throws IOException {
    try {
      return getArtistById(id, 0, 50, 50, SortBy.POPULARITY, SortOrder.ASC);
    } catch (IOException e) {
      // Re-throw as RuntimeException for consistency with original code's behavior
      throw new RuntimeException(e);
    }
  }

  /**
   * Retrieves details of an artist by their ID, with customizable pagination and sorting.
   *
   * @param id The unique identifier of the artist.
   * @param page The page number for results (0-indexed).
   * @param songCount The number of songs to retrieve.
   * @param albumCount The number of albums to retrieve.
   * @param sortBy The criteria to sort the artist's content by.
   * @param sortOrder The order in which to sort the content (ascending or descending).
   * @return An {@link Artist.ArtistModel} object containing the artist's details.
   * @throws IOException If an I/O error occurs during the API call.
   */
  public Artist.ArtistModel getArtistById(
      String id, int page, int songCount, int albumCount, SortBy sortBy, SortOrder sortOrder)
      throws IOException {
    Map<String, String> params = new HashMap<>();
    params.put("artistId", id);
    params.put("n_song", String.valueOf(songCount));
    params.put("n_album", String.valueOf(albumCount));
    params.put("page", String.valueOf(page));
    params.put("sort_order", sortOrder.name().toLowerCase());
    params.put("category", sortBy.name().toLowerCase());
    Artist.ArtistAPIResponseModel response =
        fetchFromApi(
            Endpoints.Artists.ID,
            params,
            Artist.ArtistAPIResponseModel.class,
            BaseService.ApiContext.web6dot0);

    return artistPayloadTransformation(response);
  }
}
