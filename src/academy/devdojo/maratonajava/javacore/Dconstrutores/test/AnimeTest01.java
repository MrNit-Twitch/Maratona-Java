package academy.devdojo.maratonajava.javacore.Dconstrutores.test;

import academy.devdojo.maratonajava.javacore.Dconstrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Dragon Ball","Manchete", 27,"Shounen", "Toey Animation");
        Anime anime2 = new Anime("Death Note","Crunch Roll", 19,"Invertigativo", "Madhouse");
        Anime anime3 = new Anime(); //Caso eu queira deixar uma entrada em branco, preciso criar um construtor vazio.

        anime.imprime();
        anime2.imprime();
        anime3.imprime();
    }
}
