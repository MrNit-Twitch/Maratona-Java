package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LightNovels;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamTest06 {
    private static List<LightNovels> lightNovels = new ArrayList<>(List.of(
            new LightNovels("Tensei Shittara", 8.99),
            new LightNovels("Overlord", 3.99),
            new LightNovels("Violet Evergarden", 5.99),
            new LightNovels("No Game no life", 2.99),
            new LightNovels("Fullmetal Alchemist", 15.99),
            new LightNovels("Kumo desuga", 1.99),
            new LightNovels("Kumo desuga", 1.99),
            new LightNovels("Monogari", 4.00)
    ));

    public static void main(String[] args) {
        System.out.println(lightNovels.stream().anyMatch(ln -> ln.getPrice() > 9));
        System.out.println(lightNovels.stream().anyMatch(ln -> ln.getPrice() > 0));
        System.out.println(lightNovels.stream().noneMatch(ln -> ln.getPrice() < 0));
        lightNovels.stream()
                .filter(ln -> ln.getPrice() > 3)
                .findAny()
                .ifPresent(System.out::println);
        lightNovels.stream()
                .filter(ln -> ln.getPrice() > 3)
                .sorted(Comparator.comparing(LightNovels::getPrice).reversed())
                .findFirst()
                .ifPresent(System.out::println);
        lightNovels.stream()
                .filter(ln -> ln.getPrice() > 3)
                .max(Comparator.comparing(LightNovels::getPrice))
                .ifPresent(System.out::println);
        lightNovels.stream()
                .filter(ln -> ln.getPrice() > 3)
                .min(Comparator.comparing(LightNovels::getPrice))
                .ifPresent(System.out::println);
    }
}
