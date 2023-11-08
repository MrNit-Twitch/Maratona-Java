package academy.devdojo.maratonajava.javacore.Npolimorfismo.servico;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.domino.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.domino.Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.domino.Tomate;

public class CalculadoraImposto {
    /* Estes metodos foram substituidos pelo metodo "calcularImposto" abaixo.

    public static void calcularImpostoComputador(Computador computador){
        double imposto = computador.calcularImposto();
        System.out.println("Relatório de imposto do computador");
        System.out.println("Computador: " + computador.getNome());
        System.out.println("Valor: " + computador.getValor());
        System.out.println("Imposto: " + imposto);
    }
    public static void calcularImpostoTomate(Tomate tomate){
        double imposto = tomate.calcularImposto();
        System.out.println("Relatório de imposto do tomate");
        System.out.println("Tomate: " + tomate.getNome());
        System.out.println("Valor: " + tomate.getValor());
        System.out.println("Imposto: " + imposto);
    }*/

    public static void calcularImposto(Produto produto) {
        double imposto = produto.calcularImposto();
        System.out.println("Relatório de imposto");
        System.out.println("Produto: " + produto.getNome());
        if (produto instanceof Tomate) {
            String dataValidade = ((Tomate) produto).getDataDeValidade();
            System.out.println("Data de Validade: " + dataValidade);
        }
        System.out.println("Preço: R$" + produto.getValor());
        System.out.println("Imposto a ser pago: R$" + imposto);
    }
}
