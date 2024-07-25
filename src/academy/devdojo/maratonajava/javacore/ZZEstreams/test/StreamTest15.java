package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Category;
import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LightNovels;
import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Promotion;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class StreamTest15 {
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
        Map<Category, DoubleSummaryStatistics> collect = lightNovels.stream()
                .collect(Collectors.groupingBy(LightNovels::getCategory, Collectors.summarizingDouble(LightNovels::getPrice)));
        System.out.println(collect);

        Map<Category, Set<Promotion>> collect1 = lightNovels.stream()
                .collect(Collectors.groupingBy(LightNovels::getCategory, mapping(StreamTest15::getPromotion, toSet())));

        System.out.println(collect1);

        Map<Category, LinkedHashSet<Promotion>> collect2 = lightNovels.stream()
                .collect(Collectors.groupingBy(LightNovels::getCategory, mapping(StreamTest15::getPromotion, toCollection(LinkedHashSet::new))));

        System.out.println(collect2);
    }

    private static Promotion getPromotion(LightNovels ln) {
        return ln.getPrice() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE;
    }
}
