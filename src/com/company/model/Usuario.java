package com.company.model;

import com.company.AvaliacaoVideo;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nome;
    private String email;
    private String senha;
    private String dataNascimento;

    private List<Video> videosUpados;
    private List<Video> videosAssistidos;
    private List<AvaliacaoVideo> avaliacoesDadas;
    private List<Comentario> comentariosDados;
    private List<Playlist> playlists;
    private List<Video> favoritos;
    private List<Usuario> inscritos;

    public Usuario(String nome, String email, String senha, String dataNascimento) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.dataNascimento = dataNascimento;
        this.videosUpados = new ArrayList<Video>();
        this.videosAssistidos = new ArrayList<Video>();
        this.avaliacoesDadas = new ArrayList<AvaliacaoVideo>();
        this.comentariosDados = new ArrayList<Comentario>();
        this.playlists = new ArrayList<Playlist>();
        this.favoritos = new ArrayList<Video>();
        this.inscritos = new ArrayList<Usuario>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void upload(Video video) {
        this.videosUpados.add(video);
    }

    public void assistir(Video video) {
        this.videosAssistidos.add(video);
        video.addView();
    }

    public void avaliar(Video video, int nota) {
        AvaliacaoVideo avaliacao = new AvaliacaoVideo(this, video, nota);
        video.addAvaliacao(avaliacao);
        this.addAvaliacao(avaliacao);
    }

    private void addAvaliacao(AvaliacaoVideo avaliacao) {
        this.avaliacoesDadas.add(avaliacao);
    }

    public void comentar(Video video, String txtComentario) {
        Comentario comentario = new Comentario(this, video, txtComentario);
        video.addComentario(comentario);
        this.addComentario(comentario);
    }

    private void addComentario(Comentario comentario) {
        this.comentariosDados.add(comentario);
    }

    public void addPlaylist(Playlist playlist) {
        this.playlists.add(playlist);
    }

    public void addFavorito(Video video) {
        this.favoritos.add(video);
    }

    public void inscrever(Usuario usuarioDestino) {
        usuarioDestino.addInscrito(this);
    }

    public void addInscrito(Usuario inscrito) {
        this.inscritos.add(inscrito);
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", senha='" + senha + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", qtdVideosAssistidos=" + videosAssistidos.size() +
                ", QtdInscritos=" + inscritos.size() +
                '}';
    }
}
