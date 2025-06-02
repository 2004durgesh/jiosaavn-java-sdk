package com.jiosaavn;


import com.jiosaavn.services.AlbumService;
import com.jiosaavn.services.ArtistService;
import com.jiosaavn.services.PlaylistService;
import com.jiosaavn.services.SearchService;

public class JioSaavnClient {

    public final AlbumService albumService;
    public final ArtistService artistService;
    public final PlaylistService playlistService;
    public final SearchService searchService;

    public JioSaavnClient() {
        this.albumService = new AlbumService();
        this.artistService = new ArtistService();
        this.playlistService = new PlaylistService();
        this.searchService = new SearchService();
    }

}