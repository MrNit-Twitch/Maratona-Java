package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class SmartphoneListTest01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("654987", "Iphone");
        Smartphone s2 = new Smartphone("123987", "Pixel");
        Smartphone s3 = new Smartphone("987654", "Samsung");
        List<Smartphone> smartphones = new ArrayList<>(6);
        smartphones.add(s1);
        smartphones.add(s2);
        smartphones.add(0, s3); // mudar a posição do indice
        for (Smartphone smartphone : smartphones){
            System.out.println(smartphone);
        }

        Smartphone s4 = new Smartphone("123987", "Pixel");
        System.out.println(smartphones.contains(s4));
        int indexSmartphone = smartphones.indexOf(s4);
        System.out.println(indexSmartphone);
        /*int indexSmartphone4 = smartphones.indexOf(4);
        System.out.println(smartphones.get(indexSmartphone4));*/
    }
}
