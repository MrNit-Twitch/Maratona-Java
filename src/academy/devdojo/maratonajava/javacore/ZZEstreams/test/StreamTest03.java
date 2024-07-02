package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LightNovels;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest03 {
    private static List<LightNovels> lightNovels = new ArrayList<>(List.of(
            new LightNovels("Tensei Shittara", 8.99),
            new LightNovels("Overlord", 3.99),
            new LightNovels("Violet Evergarden", 5.99),
            new LightNovels("No Game no life", 2.99),
            new LightNovels("Fullmetal Alchemist", 5.99),
            new LightNovels("Kumo desuga", 1.99),
            new LightNovels("Kumo desuga", 1.99),
            new LightNovels("Monogari", 4.00)
    ));

    public static void main(String[] args) {
        Stream<LightNovels> stream = lightNovels.stream();
        lightNovels.forEach(System.out::println);
        System.out.println("------------------------------------");
        /*long count = stream
                .filter(ln -> ln.getPrice() <= 4)
                .count();*/
        long count = stream
                .filter(ln -> ln.getPrice() <= 4)
                .distinct()
                .count();
        System.out.println(count);
    }
}
