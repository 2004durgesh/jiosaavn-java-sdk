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

    public Playlist.PlaylistModel playlistPlayLoadTransformation(Playlist.PlaylistAPIResponseModel playlist) {
        Playlist.PlaylistModel model = new Playlist.PlaylistModel();
        List<Song.SongModel> songs= new ArrayList<>();
        List<ArtistMap.ArtistMapModel> artists=new ArrayList<>();
        model.id = playlist.id;
        model.name = playlist.title;
        model.description = playlist.headerDesc;
        model.type = playlist.type;
        if (playlist.year != null && !playlist.year.isEmpty()) {
            model.year = Integer.parseInt(playlist.year);
        }if (playlist.playCount != null && !playlist.playCount.isEmpty()) {
            model.playCount = Integer.parseInt(playlist.playCount);
        }if (playlist.listCount != null && !playlist.listCount.isEmpty()) {
            model.songCount = Integer.parseInt(playlist.listCount);
        }
        model.language=playlist.language;
        model.explicitContent=Boolean.parseBoolean(playlist.explicitContent);
        model.url=playlist.permaUrl;
        model.image= Utils.createImageLinks(playlist.image);
        if(playlist.list !=null && !playlist.list.isEmpty()){
            for(Song.SongAPIResponseModel song:playlist.list){
                songs.add(songArrayTransformation(song));
            }
            model.songs=songs;
        }else{
            model.songs=null;
        }if(playlist.moreInfo.artists !=null && !playlist.moreInfo.artists.isEmpty()){
            for(Artist.ArtistAPIResponseModel artist:playlist.moreInfo.artists){
                artists.add(artistMapPlayloadTransformation(artist));
            }
            model.artists=Utils.uniqueById(artists);
        }else{
            model.artists=null;
        }

        return model;
    }

    public Playlist.PlaylistModel getPlaylistById(String id) throws IOException {
        Map<String, String> params = new HashMap<>();
        params.put("listid", id);
        Playlist.PlaylistAPIResponseModel response = fetchFromApi(Endpoints.Playlists.ID, params, Playlist.PlaylistAPIResponseModel.class, ApiContext.web6dot0);
        return playlistPlayLoadTransformation(response);
    }
}