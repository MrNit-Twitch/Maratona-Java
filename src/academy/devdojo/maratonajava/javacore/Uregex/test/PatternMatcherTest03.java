package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest03 {
    public static void main(String[] args) {
        //\d = Localiza todos os digitos
        //\D = Localiza todos os NÃO digitos
        //\s = Localiza todos os espaços em branco considerando \t \n \f \r
        //\S = Localiza todos os caracters excluindo os brancos
        //\w = Localiza todos os Digitos e letras e _
        //\W = Oposto do \w
        //[] = procura o que estiver dentro dos colchete
        String regex = "[a-zA-D]";
        String text = "cafeBABE";
        String regex2 = "0[xX][0-9a-fA-F]";
        String text2 = "12 0x 0X 0xFFABC 0x109 0x1";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        Pattern pattern2 = Pattern.compile(regex2);
        Matcher matcher2 = pattern2.matcher(text2);

        System.out.println("texto 1:  " + text);
        System.out.println("regex 1:  " + regex);
        System.out.println("texto 2:  " + text2);
        System.out.println("regex 2:  " + regex2);

        System.out.println("Posições encontradas");

        while (matcher.find()){
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }
        while (matcher2.find()){
            System.out.print(matcher2.start() + " " + matcher2.group() + "\n");
        }


    }
}
