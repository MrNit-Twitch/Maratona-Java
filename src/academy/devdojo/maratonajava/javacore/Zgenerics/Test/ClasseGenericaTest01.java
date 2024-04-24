package academy.devdojo.maratonajava.javacore.Zgenerics.Test;

import academy.devdojo.maratonajava.javacore.Zgenerics.Domino.Carro;
import academy.devdojo.maratonajava.javacore.Zgenerics.Service.CarroRentavelService;

public class ClasseGenericaTest01 {
    public static void main(String[] args) {
        CarroRentavelService carroRentavelService = new CarroRentavelService();
        Carro carro = carroRentavelService.buscaCarroDisponivel();
        System.out.println("Usando o carro por um mês...");
        carroRentavelService.retornarCarroAlugado(carro);
    }
}
