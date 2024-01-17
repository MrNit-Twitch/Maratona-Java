package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest04 {
    public static void main(String[] args) {
        //\d = Localiza todos os digitos
        //\D = Localiza todos os NÃO digitos
        //\s = Localiza todos os espaços em branco considerando \t \n \f \r
        //\S = Localiza todos os caracters excluindo os brancos
        //\w = Localiza todos os Digitos e letras e _
        //\W = Oposto do \w
        //[] = procura o que estiver dentro dos colchete
        // ? Zero ou menos
        // * zero ou mais
        // + uma ou mais
        // {n,m} de n até m
        // () agrupar
        // | significa "ou" ex: o(c|v)o = vai procurar por oco ou ovo
        // $ fim da linha

        String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";
        String text = "12 0x 0X 0xFFABC 0x10G 0x1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        System.out.println("texto 1:  " + text);
        System.out.println("regex 1:  " + regex);

        System.out.println("Posições encontradas");

        while (matcher.find()){
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }
    }
}
