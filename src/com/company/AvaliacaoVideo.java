package com.company;

import com.company.model.Usuario;
import com.company.model.Video;

public class AvaliacaoVideo {
    private Usuario usuario;
    private Video video;
    private int nota;

    public AvaliacaoVideo(Usuario usuario, Video video, int nota) {

        this.usuario = usuario;
        this.video = video;
        this.nota = nota;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Video getVideo() {
        return video;
    }

    public void setVideo(Video video) {
        this.video = video;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "AvaliacaoVideo{" +
                "usuario=" + usuario.getNome() +
                ", video=" + video.getTitulo() +
                ", nota=" + nota +
                '}';
    }
}
