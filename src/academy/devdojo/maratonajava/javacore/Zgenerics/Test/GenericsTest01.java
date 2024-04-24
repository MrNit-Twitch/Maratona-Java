package academy.devdojo.maratonajava.javacore.Zgenerics.Test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Consumidor;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest01 {
    public static void main(String[] args) {
        /* Antigamente era feito assim (Java 4.0)
        List lista = new ArrayList<>();
        lista.add("Midorya");
        lista.add(123L);
        lista.add(new Consumidor("Goku"));

        for (Object o : lista){
            System.out.println(o); //(Imprime direto tranformando tudo em String
            if (o instanceof String){
                System.out.println(o);
            }
            if (o instanceof Long){
                System.out.println(o);
            }
            if (o instanceof Consumidor){
                Consumidor c = (Consumidor) o;
                System.out.println(c);
            }
        }*/
        List<String> lista = new ArrayList<>();
        lista.add("Midorya");
        lista.add("Goku");
        for (String o : lista){
            System.out.println(o);
        }
    }
}
