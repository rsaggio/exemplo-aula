package com.company.model;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private Usuario usuario;
    private List<Video> videos;

    public Playlist(Usuario usuario) {

        this.usuario = usuario;
        usuario.addPlaylist(this);
        this.videos = new ArrayList<Video>();
    }

    public void addVideo(Video video) {
        this.videos.add(video);
    }
}
