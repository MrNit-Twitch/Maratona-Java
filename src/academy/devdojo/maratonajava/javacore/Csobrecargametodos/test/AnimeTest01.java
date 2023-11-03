package academy.devdojo.maratonajava.javacore.Csobrecargametodos.test;

import academy.devdojo.maratonajava.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.setNome("Full Metal Alchmist");
        anime.setTipo("TV");
        anime.setEpisodios(12);
        anime.init("Death Note", "Cranch Roll", 19, "Ação");
        anime.imprime();
    }
}
