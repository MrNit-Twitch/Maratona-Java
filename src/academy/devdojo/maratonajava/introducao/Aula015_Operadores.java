package academy.devdojo.maratonajava.introducao;

import java.sql.SQLOutput;

public class Aula015_Operadores {
    public static void main(String[] args) {
        // + - / *
        int numero01 = 10;
        double numero02 = 20.0;
        double resultado = numero01 / numero02;
        System.out.println("O resultado é: " + resultado);
        // Opção 2 = System.out.println("Valor " + (numero02 + numero01));

        // % (Resto da divisão
        int resto = 21 % 7;
        System.out.println("O resto da divisão é: " + resto);

        /*
        < menor
        > maior
        <= menor igual
        >= maior igual
        == igual
        != diferente
         */
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezMenorOuIgualAVinte = 10 <= 20;
        boolean isDezMaiorOuIgualAVinte = 10 >= 20;
        boolean isDezIgualAVinte = 10 == 20;
        boolean isDezDiferenteDeVinte = 10 != 20;
        boolean is10maiorQue20 = !(10>20);

        System.out.println("isDezMaiorQueVinte: " + isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte: " + isDezMenorQueVinte);
        System.out.println("isDezMenorOuIgualAVinte: " + isDezMenorOuIgualAVinte);
        System.out.println("isDezMaiorOuIgualAVinte: " + isDezMaiorOuIgualAVinte);
        System.out.println("isDezIgualAVinte: " + isDezIgualAVinte);
        System.out.println("isDezDiferenteDeVinte: " + isDezDiferenteDeVinte);
        System.out.println("is10maiorQue20: " + is10maiorQue20);

        // && (AND / E)
        int idade = 29;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean inDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;

        System.out.println("isDentroDaLeiMaiorQueTrinta " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("inDentroDaLeiMenorQueTrinta " + inDentroDaLeiMenorQueTrinta);

        // || (OR / OU)
        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000F;
        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;
        System.out.println("isPlaystationCincoCompravel " + isPlaystationCincoCompravel);

        // ! (NOT / Não) ((veremos depois))

        // = += -= *= /=
        double bonus = 1800; //1800
        bonus += 1000; //2800
        bonus -= 1000; //1800
        bonus *= 2; //3600
        bonus /= 2; //1800
        bonus %= 2; //0
        System.out.println(bonus);

        // ++ --
        int contador = 0;
        contador +=1; // = 1
        contador ++; // = 2
        contador --; // = 1
        System.out.println(contador);
        int contador2 = 2;
        // System.out.println(++ contador + " " + ++ contador2);
        contador ++;
        contador2 ++;
        System.out.println(contador + " " + contador2);


    }
}
