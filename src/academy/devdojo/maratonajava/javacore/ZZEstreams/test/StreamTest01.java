package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LightNovels;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamTest01 {
    //1. Order LightNovels by title
    //2. Retrieve the first 3 light novels with price less than 4
    private static List<LightNovels> lightNovels = new ArrayList<>(List.of(
            new LightNovels("Tensei Shittara", 8.99),
            new LightNovels("Overlord", 3.99),
            new LightNovels("Violet Evergarden", 5.99),
            new LightNovels("No Game no life", 2.99),
            new LightNovels("Fullmetal Alchemist", 5.99),
            new LightNovels("Kumo desuga", 1.99),
            new LightNovels("Monogari", 4.00)
    ));
    public static void main(String[] args) {
        lightNovels.sort(Comparator.comparing(LightNovels::getTitle));
        System.out.println(lightNovels);
        List<String> titles = new ArrayList<>();
        for (LightNovels lightNovel : lightNovels) {
            if (lightNovel.getPrice() <=4){
                titles.add(lightNovel.getTitle());
            }
            if (titles.size() >=3){
                break;
            }
        }

        System.out.println(lightNovels);
        System.out.println(titles);
    }
}
