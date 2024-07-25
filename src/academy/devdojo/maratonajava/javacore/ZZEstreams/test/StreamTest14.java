package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Category;
import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LightNovels;
import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Promotion;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

import static academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Promotion.NORMAL_PRICE;
import static academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Promotion.UNDER_PROMOTION;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.maxBy;

public class StreamTest14 {
    private static List<LightNovels> lightNovels = new ArrayList<>(List.of(
            new LightNovels("Tensei Shittara", 8.99, Category.FANTASY),
            new LightNovels("Overlord", 18.99, Category.FANTASY),
            new LightNovels("Violet Evergarden", 5.99, Category.DRAMA),
            new LightNovels("No Game no life", 2.99, Category.FANTASY),
            new LightNovels("Fullmetal Alchemist", 5.99, Category.FANTASY),
            new LightNovels("Kumo desuga", 1.99, Category.FANTASY),
            new LightNovels("Kumo desuga", 1.99, Category.FANTASY),
            new LightNovels("Monogari", 4.00, Category.ROMANCE)
    ));
    public static void main(String[] args) {
        Map<Category, Long> collect = lightNovels.stream().collect(groupingBy(LightNovels::getCategory, Collectors.counting()));
        System.out.println(collect);
        Map<Category, Optional<LightNovels>> collect1 = lightNovels
                .stream()
                .collect(groupingBy(LightNovels::getCategory, maxBy(Comparator.comparing(LightNovels::getPrice))));
        System.out.println(collect1);

        Map<Category, LightNovels> collect2 = lightNovels.stream().collect(groupingBy(LightNovels::getCategory, Collectors.collectingAndThen(maxBy(Comparator.comparing(LightNovels::getPrice)), Optional::get)));
        System.out.println(collect2);

        Map<Category, LightNovels> collect3 = lightNovels.stream().collect(Collectors.toMap(LightNovels::getCategory, Function.identity(), BinaryOperator.maxBy(Comparator.comparing(LightNovels::getPrice))));
        System.out.println(collect3);

    }
}
