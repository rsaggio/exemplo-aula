package com.company;

import com.company.model.Playlist;
import com.company.model.Usuario;
import com.company.model.Video;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Video video = new Video("O alto da compadecida", "/altodacompadecida", "filme brasileiro", 600);
        Usuario usuario = new Usuario("Renan", "renan.saggio@4y2.org", "senha", "06/04/1995");
        Usuario usuario2 = new Usuario("Manu", "manu@4y2.org", "senha","12/12/2000");

        usuario.upload(video);

        usuario.assistir(video);
        usuario.assistir(video);
        usuario.assistir(video);
        usuario.assistir(video);
        usuario.assistir(video);
        usuario.assistir(video);
        usuario.assistir(video);

        usuario.avaliar(video, 5);
        usuario.comentar(video, "Gostei do video");

        Playlist playlist = new Playlist(usuario);
        playlist.addVideo(video);

        usuario.addFavorito(video);

        usuario.inscrever(usuario2);

        System.out.println(video);
        System.out.println(usuario2);
        System.out.println(usuario);

    }
}
