package com.jiosaavn.services;

import com.jiosaavn.constants.Endpoints;
import com.jiosaavn.models.BaseService;
import com.jiosaavn.models.Playlist;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Service class for interacting with JioSaavn playlist-related APIs.
 * This class extends {@link BaseService} to inherit common API interaction functionalities.
 */
public class PlaylistService extends BaseService {

    /**
     * Retrieves the details of a playlist by its ID.
     *
     * @param id The unique identifier of the playlist.
     * @return A {@link Playlist.PlaylistModel} object containing the playlist's details.
     * @throws IOException If an I/O error occurs during the API call.
     */
    public Playlist.PlaylistModel getPlaylistById(String id) throws IOException {
        Map<String, String> params = new HashMap<>();
        params.put("listid", id);
        Playlist.PlaylistAPIResponseModel response = fetchFromApi(Endpoints.Playlists.ID, params, Playlist.PlaylistAPIResponseModel.class, ApiContext.web6dot0);
        return playlistPayLoadTransformation(response);
    }
}