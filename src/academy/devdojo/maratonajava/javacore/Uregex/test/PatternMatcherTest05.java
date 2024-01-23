package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest05 {
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
        // . 1.3 = 123, 133, 1@3, 1A3, (Qualquer coisa entre 1 e 3)

        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";
        String text = "luffy@hotmail.com, 123jotaro@gmail.com, #@!zoro@mail.br, teste@gmail.com.br, sakura@mail ";
        System.out.println("Texto Valido");
        System.out.println("#@!zoro@mail.br".matches(regex));
        System.out.println(Arrays.toString(text.split(",")));
        System.out.println(text.split(",")[1].trim());
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
