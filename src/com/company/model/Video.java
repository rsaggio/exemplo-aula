package com.company.model;

import com.company.AvaliacaoVideo;

import java.util.ArrayList;
import java.util.List;

public class Video {
    private String titulo;
    private String url;
    private String descricao;
    private int duracao;
    private int views;
    private List<AvaliacaoVideo> avaliacoes;
    private List<Comentario> comentarios;

    public Video(String titulo, String url, String descricao, int duracao) {
        this.titulo = titulo;
        this.url = url;
        this.descricao = descricao;
        this.duracao = duracao;
        this.views = 0;
        this.avaliacoes = new ArrayList<AvaliacaoVideo>();
        this.comentarios = new ArrayList<Comentario>();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public void addView() {
        this.views += 1;
    }

    public void addAvaliacao(AvaliacaoVideo avaliacao) {
        this.avaliacoes.add(avaliacao);
    }

    public void addComentario(Comentario comentario) {
        this.comentarios.add(comentario);
    }

    @Override
    public String toString() {
        return "Video{" +
                "titulo='" + titulo + '\'' +
                ", url='" + url + '\'' +
                ", descricao='" + descricao + '\'' +
                ", duracao=" + duracao +
                ", views=" + views +
                ", avaliacoes=" + avaliacoes +
                ", comentarios=" + comentarios +
                '}';
    }
}
