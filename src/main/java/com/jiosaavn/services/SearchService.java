package com.jiosaavn.services;

import com.jiosaavn.constants.Endpoints;
import com.jiosaavn.models.BaseService;
import com.jiosaavn.models.Search;
import com.jiosaavn.utils.Utils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SearchService extends BaseService {



    public List<Search.SearchModel> search(String query) throws IOException {
        Map<String, String> params = new HashMap<>();
        params.put("query", query);
        Search.SearchAPIResponseModel response = fetchFromApi(
                Endpoints.Search.ALL,
                params,
                Search.SearchAPIResponseModel.class,  // Changed from SearchApiResponseWrapper
                ApiContext.web6dot0
        );

        List<Search.SearchModel> result = new ArrayList<>();
        result.add(searchPayloadTransformation(response));  // Process single response
        return result;
    }
}