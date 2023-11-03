package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Carros;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraCarros;

public class CarrosTeste {
    public static void main(String[] args) {
        Carros carros01 = new Carros();
        carros01.nome = "Honda";
        carros01.modelo = "Civic";
        carros01.ano = 2023;

        Carros carros02 = new Carros();
        carros02.nome = "Renaut";
        carros02.modelo = "Megane";
        carros02.ano = 2022;
        carros02.imprimir();
        Carros carros03 = new Carros();
        /*Caso não haja nenhuma atribuição, são impressos
        os atributos da classe original.*/


        ImpressoraCarros carros = new ImpressoraCarros();
        carros.imprimir(carros01);
        carros.imprimir(carros02);
        carros.imprimir(carros03);
    }
}
