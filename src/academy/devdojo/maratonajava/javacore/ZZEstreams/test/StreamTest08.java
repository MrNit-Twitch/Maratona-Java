package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LightNovels;

import java.util.ArrayList;
import java.util.List;

public class StreamTest08 {
    private static List<LightNovels> lightNovels = new ArrayList<>(List.of(
            new LightNovels("Tensei Shittara", 8.99),
            new LightNovels("Overlord", 18.99),
            new LightNovels("Violet Evergarden", 5.99),
            new LightNovels("No Game no life", 2.99),
            new LightNovels("Fullmetal Alchemist", 5.99),
            new LightNovels("Kumo desuga", 1.99),
            new LightNovels("Kumo desuga", 1.99),
            new LightNovels("Monogari", 4.00)
    ));

    public static void main(String[] args) {
        lightNovels.stream()
                .map(LightNovels::getPrice)
                .filter(price -> price > 3)
                .reduce(Double::sum)
                .ifPresent(System.out::println);

        double sum = lightNovels.stream()
                .mapToDouble(LightNovels::getPrice)
                .filter(price -> price > 3)
                .sum();

        System.out.println(sum);
    }
}
