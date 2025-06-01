package com.jiosaavn.services;

import com.fasterxml.jackson.core.type.TypeReference;
import com.jiosaavn.constants.Endpoints;
import com.jiosaavn.models.BaseService;
import com.jiosaavn.models.artists.Artist;
import com.jiosaavn.utils.JsonUtils;
import com.jiosaavn.utils.Utils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArtistService extends BaseService {
    public enum SortBy {
        POPULARITY, LATEST, ALPHABETICAL
    }

    public enum SortOrder {
        ASC, DESC
    }


    public Artist.ArtistModel getArtistById(String id, int page, int songCount, int albumCount) throws IOException {
        try {
            return getArtistById(id, page, songCount, albumCount, SortBy.POPULARITY, SortOrder.ASC);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public Artist.ArtistModel getArtistById(String id, int page, int songCount, int albumCount, SortBy sortBy, SortOrder sortOrder) throws IOException {
        Map<String, String> params = new HashMap<>();
        params.put("token", id);
        params.put("type", "artist");
        params.put("n_song", String.valueOf(songCount));
        params.put("n_album", String.valueOf(albumCount));
        params.put("page", String.valueOf(page));
        params.put("sort_order", sortOrder.name().toLowerCase());
        params.put("category", sortBy.name().toLowerCase());
        Artist.ArtistAPIResponseModel response = fetchFromApi(Endpoints.Artists.ID, params, Artist.ArtistAPIResponseModel.class, BaseService.ApiContext.web6dot0);

        return artistPayloadTransformation(response);
    }
}
