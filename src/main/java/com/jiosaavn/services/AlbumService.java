package com.jiosaavn.services;

import com.jiosaavn.constants.Endpoints;
import com.jiosaavn.models.Album;
import com.jiosaavn.models.BaseService;
import com.jiosaavn.models.Playlist;
import com.jiosaavn.models.Song;
import com.jiosaavn.utils.Utils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AlbumService extends BaseService {


    public Album.AlbumModel getAlbumById(String id) throws IOException {
        Map<String, String> params = new HashMap<>();
        params.put("albumid", id);
        Album.AlbumAPIResponseModel response = fetchFromApi(Endpoints.Albums.ID, params, Album.AlbumAPIResponseModel.class, ApiContext.web6dot0);
        return albumPayloadTransformation(response);
    }
}

