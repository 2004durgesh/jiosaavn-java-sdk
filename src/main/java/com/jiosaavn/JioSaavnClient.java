package com.jiosaavn;

import java.io.IOException;
import java.util.List;

import com.jiosaavn.models.Playlist;
import com.jiosaavn.models.Song;
import com.jiosaavn.models.artists.Artist;
import com.jiosaavn.services.ArtistService;
import com.jiosaavn.services.PlaylistService;
import com.jiosaavn.services.SongService;
import com.jiosaavn.utils.JsonUtils;

public class JioSaavnClient {

    public static void main(String[] args) {
        SongService client = new SongService();

        try {
            // Test search
            System.out.println("=== Testing Search ===");
            Song.SongLyrics songByLink = client.getLyricsById("wcsDiSsA");
            System.out.println(JsonUtils.toJson(songByLink));


        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}