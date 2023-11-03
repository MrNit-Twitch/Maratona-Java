package academy.devdojo.maratonajava.javacore.Kenum.Test;

import academy.devdojo.maratonajava.javacore.Kenum.Dominio.Cliente02;
import academy.devdojo.maratonajava.javacore.Kenum.Dominio.TipoCliente;

public class ClienteTest02 {
    public static void main(String[] args) {
        Cliente02 cliente1 = new Cliente02("Arthus", TipoCliente.PESSOA_FISICA);
        Cliente02 cliente2 = new Cliente02("Mr.Nit", TipoCliente.PESSOA_JURIDICA);

        System.out.println(cliente1);
        System.out.println(cliente2);
    }
}
