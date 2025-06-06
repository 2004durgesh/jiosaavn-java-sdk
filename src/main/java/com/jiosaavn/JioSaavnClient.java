package com.jiosaavn;


import com.jiosaavn.services.*;

/**
 * The main client for interacting with the JioSaavn API.
 * This class provides access to various services for retrieving album, artist,
 * playlist, search, and song information.
 */
public class JioSaavnClient {

    /**
     * Service for handling album-related API requests.
     */
    public final AlbumService albumService;
    /**
     * Service for handling artist-related API requests.
     */
    public final ArtistService artistService;
    /**
     * Service for handling playlist-related API requests.
     */
    public final PlaylistService playlistService;
    /**
     * Service for handling search-related API requests.
     */
    public final SearchService searchService;
    /**
     * Service for handling song-related API requests.
     */
    public final SongService songService;

    /**
     * Constructs a new {@code JioSaavnClient} instance, initializing all
     * available API services.
     */
    public JioSaavnClient() {
        this.albumService = new AlbumService();
        this.artistService = new ArtistService();
        this.playlistService = new PlaylistService();
        this.searchService = new SearchService();
        this.songService=new SongService();
    }

}