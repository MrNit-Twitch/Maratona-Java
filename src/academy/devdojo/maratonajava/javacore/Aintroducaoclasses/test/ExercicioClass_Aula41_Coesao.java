package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carros;

public class ExercicioClass_Aula41_Coesao {
    public static void main(String[] args) {

        Carros car01 = new Carros();
        car01.name = "Tesla";
        car01.model = "Model S";
        car01.year = 2012;

        Carros car02 = new Carros();
        car02.name = "Porsche";
        car02.model = "Taycan Turbo S";
        car02.year = 2023;

        System.out.println("Carros Elétricos Super Esportivos: ");
        System.out.println("-----------------------------------");
        System.out.println("Modelo 1");
        System.out.println("Nome: " + car01.name + " - Modelo: " + car01.model + " - Ano: " + car01.year);
        System.out.println("Modelo 2");
        System.out.println("Nome: " + car02.name + " - Modelo: " + car02.model + " - Ano: " + car02.year);
    }
}
