package academy.devdojo.maratonajava.javacore.ZZClambdas.Service;

import academy.devdojo.maratonajava.javacore.ZZClambdas.dominio.Anime;

public class AnimeComparators {
    public static int copareByTitle(Anime a1, Anime a2){
        return a1.getTitle().compareTo(a2.getTitle());
    }

    public static int compareByEpisodes(Anime a1, Anime a2){
        return  Integer.compare(a1.getEpisode(),a2.getEpisode());
    }

    public int compareByEpisodesNonStatic(Anime a1, Anime a2){
        return  Integer.compare(a1.getEpisode(),a2.getEpisode());
    }
}
