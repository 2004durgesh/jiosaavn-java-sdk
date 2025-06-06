package com.jiosaavn.constants;

public class Endpoints {

    public static class Search {
        public static final String ALL = "autocomplete.get";
        public static final String SONGS = "search.getResults";
        public static final String ALBUMS = "search.getAlbumResults";
        public static final String ARTISTS = "search.getArtistResults";
        public static final String PLAYLISTS = "search.getPlaylistResults";
    }

    public static class Songs {
        public static final String ID = "song.getDetails";
        public static final String LINK = "webapi.get";
        public static final String SUGGESTIONS = "webradio.getSong";
        public static final String LYRICS = "lyrics.getLyrics";
        public static final String STATION = "webradio.createEntityStation";
    }

    public static class Albums {
        public static final String ID = "content.getAlbumDetails";
        public static final String LINK = "webapi.get";
    }

    public static class Artists {
        public static final String ID = "artist.getArtistPageDetails";
        public static final String LINK = "webapi.get";
        public static final String SONGS = "artist.getArtistMoreSong";
        public static final String ALBUMS = "artist.getArtistMoreAlbum";
    }

    public static class Playlists {
        public static final String ID = "playlist.getDetails";
        public static final String LINK = "webapi.get";
    }

    public static final String MODULES = "content.getBrowseModules";
    public static final String TRENDING = "content.getTrending";

}

