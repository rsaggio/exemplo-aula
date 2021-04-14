package com.company.model;

public class Comentario {
    private Usuario usuario;
    private Video video;
    private String txtComentario;

    public Comentario(Usuario usuario, Video video, String txtComentario) {

        this.usuario = usuario;
        this.video = video;
        this.txtComentario = txtComentario;
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

    public String getTxtComentario() {
        return txtComentario;
    }

    public void setTxtComentario(String txtComentario) {
        this.txtComentario = txtComentario;
    }

    @Override
    public String toString() {
        return "Comentario{" +
                "usuario=" + usuario.getNome() +
                ", video=" + video.getTitulo() +
                ", txtComentario='" + txtComentario + '\'' +
                '}';
    }
}
