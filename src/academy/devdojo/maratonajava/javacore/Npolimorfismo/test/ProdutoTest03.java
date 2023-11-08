package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.domino.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.domino.Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.domino.Tomate;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto produto = new Computador("Computador Ryzen 9", 3000);

        Tomate tomate = new Tomate("Tomate Cereja", 10);
        tomate.setDataDeValidade("11/12/2023");

        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("-----------------------------------");
        CalculadoraImposto.calcularImposto(produto);

    }
}
