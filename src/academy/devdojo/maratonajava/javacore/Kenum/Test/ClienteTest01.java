package academy.devdojo.maratonajava.javacore.Kenum.Test;

import academy.devdojo.maratonajava.javacore.Kenum.Dominio.Cliente01;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente01 clinte1 = new Cliente01("Tsubasa","PESSOA_FISICA");
        Cliente01 clinte2 = new Cliente01("Tsubasa","PESSOA_JURIDICA");
        Cliente01 clinte3 = new Cliente01("Tsubasa","pessoa fisica");
        Cliente01 clinte4 = new Cliente01("Tsubasa","PESSOA_Juridica");

        System.out.println(clinte1);
        System.out.println(clinte2);
        System.out.println(clinte3);
        System.out.println(clinte4);
    }
}
