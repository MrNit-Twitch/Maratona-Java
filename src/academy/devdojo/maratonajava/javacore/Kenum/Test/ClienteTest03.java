package academy.devdojo.maratonajava.javacore.Kenum.Test;

import academy.devdojo.maratonajava.javacore.Kenum.Dominio.Cliente03;
import academy.devdojo.maratonajava.javacore.Kenum.Dominio.TipoCliente;
import academy.devdojo.maratonajava.javacore.Kenum.Dominio.TipoPagamento;

public class ClienteTest03 {
    public static void main(String[] args) {
        Cliente03 cliente1 = new Cliente03("Arthus", TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);
        Cliente03 cliente2 = new Cliente03("Mr.Nit", TipoCliente.PESSOA_JURIDICA, TipoPagamento.DEBITO);
        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(546));
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(546));
    }
}
