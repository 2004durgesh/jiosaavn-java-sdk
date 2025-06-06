package com.jiosaavn.services;

import com.jiosaavn.constants.Endpoints;
import com.jiosaavn.models.BaseService;
import com.jiosaavn.models.Search;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Service class for performing search operations on JioSaavn.
 * This class extends {@link BaseService} to inherit common API interaction functionalities.
 */
public class SearchService extends BaseService {

    /**
     * Performs a comprehensive search on JioSaavn based on the provided query.
     * The search results include various types of content such as songs, albums, and artists.
     *
     * @param query The search query string.
     * @return A list of {@link Search.SearchModel} objects, where each object represents a search result category
     * and contains relevant items (e.g., a list of songs, a list of albums).
     * @throws IOException If an I/O error occurs during the API call.
     */
    public List<Search.SearchModel> search(String query) throws IOException {
        Map<String, String> params = new HashMap<>();
        params.put("query", query);
        Search.SearchAPIResponseModel response = fetchFromApi(
                Endpoints.Search.ALL,
                params,
                Search.SearchAPIResponseModel.class,
                ApiContext.web6dot0
        );

        List<Search.SearchModel> result = new ArrayList<>();
        result.add(searchPayloadTransformation(response));
        return result;
    }
}