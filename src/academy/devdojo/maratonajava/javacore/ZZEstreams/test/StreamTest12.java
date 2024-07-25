package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Category;
import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LightNovels;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest12 {
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
        Map<Category, List<LightNovels>> categoryLightNovelMap = new HashMap<>();
        List<LightNovels> fantasy = new ArrayList<>();
        List<LightNovels> drama = new ArrayList<>();
        List<LightNovels> romance = new ArrayList<>();
        for (LightNovels lightNovels : lightNovels) {
            switch (lightNovels.getCategory()) {
                case DRAMA:
                    drama.add(lightNovels);
                    break;
                case FANTASY:
                    fantasy.add(lightNovels);
                    break;
                case ROMANCE:
                    romance.add(lightNovels);
                    break;
            }
        }
        categoryLightNovelMap.put(Category.DRAMA, drama);
        categoryLightNovelMap.put(Category.FANTASY, fantasy);
        categoryLightNovelMap.put(Category.ROMANCE, romance);
        System.out.println(categoryLightNovelMap);

        Map<Category, List<LightNovels>> collect = lightNovels.stream().collect(Collectors.groupingBy(LightNovels::getCategory));
        System.out.println(collect);
    }
}
