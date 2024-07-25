package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LightNovels;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest11 {
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
        System.out.println(lightNovels.stream().count());
        System.out.println(lightNovels.stream().collect(Collectors.counting()));

        lightNovels.stream()
                .max(Comparator.comparing(LightNovels::getPrice))
                .ifPresent(System.out::println);
        lightNovels.stream()
                .collect(Collectors.maxBy(Comparator.comparing(LightNovels::getPrice)))
                .ifPresent(System.out::println);

        System.out.println(lightNovels.stream().mapToDouble(LightNovels::getPrice).sum());
        System.out.println(lightNovels.stream().collect(Collectors.summingDouble(LightNovels::getPrice)));

        System.out.println(lightNovels.stream().mapToDouble(LightNovels::getPrice).average());
        System.out.println(lightNovels.stream().collect(Collectors.averagingDouble(LightNovels::getPrice)));

        DoubleSummaryStatistics collect = lightNovels.stream().collect(Collectors.summarizingDouble(LightNovels::getPrice));
        System.out.println(collect);

        String titles = lightNovels.stream().map(LightNovels::getTitle).collect(Collectors.joining(", "));
        System.out.println(titles);


    }
}
