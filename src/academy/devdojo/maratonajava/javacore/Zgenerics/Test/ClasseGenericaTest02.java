package academy.devdojo.maratonajava.javacore.Zgenerics.Test;

import academy.devdojo.maratonajava.javacore.Zgenerics.Domino.Barco;
import academy.devdojo.maratonajava.javacore.Zgenerics.Domino.Carro;
import academy.devdojo.maratonajava.javacore.Zgenerics.Service.BarcoRentavelService;
import academy.devdojo.maratonajava.javacore.Zgenerics.Service.CarroRentavelService;

public class ClasseGenericaTest02 {
    public static void main(String[] args) {
        BarcoRentavelService carroRentavelService = new BarcoRentavelService();
        Barco barco = carroRentavelService.buscaBarcoDisponivel();
        System.out.println("Usando o barco por um mês...");
        carroRentavelService.retornarBarcoAlugado(barco);
    }
}
