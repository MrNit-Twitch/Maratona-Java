package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest01 {
    public static void main(String[] args) {
        String regex = "ab";
        String text = "abaaba";
        String regex2 = "aba";
        String text2 = "abababa";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        Pattern pattern2 = Pattern.compile(regex2);
        Matcher matcher2 = pattern2.matcher(text2);
        System.out.println("texto 1:  " + text);
        System.out.println("Indice:   0123456789");
        System.out.println("regex 1:  " + regex);
        System.out.println("texto 2:  " + text2);
        System.out.println("Indice:   0123456789");
        System.out.println("regex 2:  " + regex2);
        System.out.println("Posições encontradas");
        System.out.println("Texto 1 (ab):");
        while (matcher.find()){
            System.out.print(matcher.start() + " ");
        }
        System.out.println();
        System.out.println("Texto 2 (aba):");
        while (matcher2.find()){
            System.out.print(matcher2.start() + " ");
        }
    }
}
