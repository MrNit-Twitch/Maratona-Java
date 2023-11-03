package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double result1 = calculadora.divideDoisNumeros(20, 2);
        System.out.println(result1);
        double result2 = calculadora.divideDoisNumeros2(20, 2);
        System.out.println(result2);
        double result3 = calculadora.divideDoisNumeros3(20, 2);
        System.out.println(result3);
        calculadora.imprimeDivisaoDeDoisNumeros(20,4);
    }
}
