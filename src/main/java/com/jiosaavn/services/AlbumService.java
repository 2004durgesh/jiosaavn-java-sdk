package com.jiosaavn.services;

import com.jiosaavn.constants.Endpoints;
import com.jiosaavn.models.Album;
import com.jiosaavn.models.BaseService;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Service class for interacting with JioSaavn album-related APIs.
 * This class extends {@link BaseService} to inherit common API interaction functionalities.
 */
public class AlbumService extends BaseService {


    /**
     * Retrieves details of an album by its ID.
     *
     * @param id The unique identifier of the album.
     * @return An {@link Album.AlbumModel} object containing the album's details.
     * @throws IOException If an I/O error occurs during the API call.
     */
    public Album.AlbumModel getAlbumById(String id) throws IOException {
        Map<String, String> params = new HashMap<>();
        params.put("albumid", id);
        Album.AlbumAPIResponseModel response = fetchFromApi(Endpoints.Albums.ID, params, Album.AlbumAPIResponseModel.class, ApiContext.web6dot0);
        return albumPayloadTransformation(response);
    }
}