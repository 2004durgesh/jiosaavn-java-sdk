package com.jiosaavn.services;

import com.jiosaavn.constants.Endpoints;
import com.jiosaavn.models.Album;
import com.jiosaavn.models.BaseService;
import com.jiosaavn.models.Song;
import com.jiosaavn.utils.Utils;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.util.*;
import java.util.regex.*;

public class SongService extends BaseService {

    public List<Song.SongModel> getSongById(String id) throws IOException {
        Map<String, String> params = new HashMap<>();
        params.put("pids", id);
        Song.SongResponse response = fetchFromApi(Endpoints.Songs.ID, params, Song.SongResponse.class, ApiContext.web6dot0);
        List<Song.SongModel> result = new ArrayList<>();
        for (Song.SongAPIResponseModel song : response.songs) {
            result.add(songPayloadTransformation(song));
        }
        return result;
    }

    public List<Song.SongModel> getSongByLink(String link) throws IOException {
        Map<String, String> params = new HashMap<>();
        String regex = "jiosaavn\\.com/song/[^/]+/([^/]+)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(link);
        String token = null;
        if (matcher.find()) {
            token = matcher.group(1);  // Capture group 1
            System.out.println("Extracted ID: ");
        } else {
            System.out.println("No match found." + matcher);
        }

        params.put("type", "song");
        params.put("token", token);
        Song.SongResponse response = fetchFromApi(Endpoints.Songs.LINK, params, Song.SongResponse.class, ApiContext.web6dot0);
        List<Song.SongModel> result = new ArrayList<>();
        for (Song.SongAPIResponseModel song : response.songs) {
            result.add(songPayloadTransformation(song));
        }
        return result;
    }

    public Song.SongLyrics getLyricsById(String id) throws IOException {
        Map<String, String> params = new HashMap<>();
        params.put("lyrics_id", id);
        Song.SongLyrics response = fetchFromApi(Endpoints.Songs.LYRICS, params, Song.SongLyrics.class, ApiContext.web6dot0);
        return response;
    }
}
