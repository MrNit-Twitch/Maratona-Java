package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListTest01 {
    public static void main(String[] args) {
        // List nomes = new ArrayList(); //Até versão 1.4 do java
        List<String> nomes = new ArrayList<>(); //A partir da versão 1.5. //posso colocarum quantidade maxima inicial pré deficina nentro do new ArrayList<>(300);
        List<String> nomes2 = new ArrayList<>();
        //Para adicionar
        nomes.add("William");
        nomes.add("DevDojo Academy");
        nomes2.add("Mr.Nit");
        nomes2.add("Lindão");

        nomes.addAll(nomes2);

        for (String nome : nomes) {
            System.out.println(nome);
        }

        System.out.println("----------");

        nomes.add("Suane");
        //Para remover
        nomes.remove(0);
        nomes.remove("Suane");

        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }

        // A lista precisa ser de objetos, não podendo usar tipos primitivos (Int, Double...)
        // Para isso, usamos o "Integer"
        List<Integer> numeros = new ArrayList<>();
        numeros.add(5);
        numeros.add(2);
        numeros.add(6);
        numeros.add(65);
        numeros.add(759);
        numeros.add(9);
        numeros.add(11);

        //Para remover
        numeros.remove(4);

        for (Integer numero : numeros) {
            System.out.println(numero);
        }

    }
}
