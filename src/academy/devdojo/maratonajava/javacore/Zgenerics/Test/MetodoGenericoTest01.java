package academy.devdojo.maratonajava.javacore.Zgenerics.Test;

import academy.devdojo.maratonajava.javacore.Zgenerics.Domino.Barco;
import academy.devdojo.maratonajava.javacore.Zgenerics.Domino.Carro;

import java.util.List;

public class MetodoGenericoTest01 {
    /* Metodo 1

    public static void main(String[] args) {
        criarArrayComUmObjeto(new Barco("Canoa Marota"));
    }
    private static <T> void criarArrayComUmObjeto (T t){
        List <T> list = List.of(t);
        System.out.println(list);
    }*/

    //Metodo 2
    public static void main(String[] args) {
        List<Barco> barcoList = criarArrayComUmObjeto(new Barco("Canoa Marota"));
        System.out.println(barcoList);
    }
    private static <T> List<T> criarArrayComUmObjeto (T t) {
        return List.of(t);
    }
    /* Uso Futuro
    private static <T extends Comparable<T>> List<T> criarArrayComUmObjeto (T t) {
        return List.of(t);
    }*/

}

