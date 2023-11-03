package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.domino.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.domino.Tomate;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("NUC10i7", 11000);
        Tomate tomate = new Tomate("Tomate Cereja", 10);
        CalculadoraImposto.calcularImpostoComputador(computador);
        System.out.println("--------------------------------");
        CalculadoraImposto.calcularImpostoTomate(tomate);
    }
}
