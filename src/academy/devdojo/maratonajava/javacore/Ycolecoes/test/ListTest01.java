package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        // List nomes = new ArrayList(); //Até versão 1.4 do java
        List<String> nomes = new ArrayList<>(); //A partir da versão 1.5. //posso colocarum quantidade maxima inicial pré deficina nentro do new ArrayList<>(300);
        nomes.add("William");
        nomes.add("DevDojo Academy");

        for (String nome : nomes){
            System.out.println(nome);
        }
        System.out.println("----------");
        nomes.add("Suane");

        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }

    }
}
