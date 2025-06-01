package com.jiosaavn.services;

import com.jiosaavn.constants.Endpoints;
import com.jiosaavn.models.BaseService;
import com.jiosaavn.models.Playlist;
import com.jiosaavn.models.Song;
import com.jiosaavn.models.artists.Artist;
import com.jiosaavn.models.artists.ArtistMap;
import com.jiosaavn.utils.Utils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PlaylistService extends BaseService {


    public Playlist.PlaylistModel getPlaylistById(String id) throws IOException {
        Map<String, String> params = new HashMap<>();
        params.put("listid", id);
        Playlist.PlaylistAPIResponseModel response = fetchFromApi(Endpoints.Playlists.ID, params, Playlist.PlaylistAPIResponseModel.class, ApiContext.web6dot0);
        return playlistPayLoadTransformation(response);
    }
}