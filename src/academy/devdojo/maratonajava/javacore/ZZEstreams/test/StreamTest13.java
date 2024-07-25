package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Category;
import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LightNovels;
import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Promotion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Promotion.*;
import static java.util.stream.Collectors.*;

public class StreamTest13 {
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
        Map<Promotion, List<LightNovels>> collect = lightNovels
                .stream()
                .collect(groupingBy(ln -> ln.getPrice() < 6 ? UNDER_PROMOTION : NORMAL_PRICE
                ));
        System.out.println(collect);

        Map<Category, Map<Promotion, List<LightNovels>>> collect1 = lightNovels
                .stream()
                .collect(groupingBy(LightNovels::getCategory, groupingBy(ln ->
                        ln.getPrice() < 6 ? UNDER_PROMOTION : NORMAL_PRICE
                )));
        System.out.println(collect1);
    }
}
