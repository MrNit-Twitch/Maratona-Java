package academy.devdojo.maratonajava.introducao;

public class Aula010_TiposPrimitivos {
    public static void main(String[] args) {
        // Tipos Primitivos (tudo sempre em minuscula): int, long, double, float, byte, short, boolean, char.
        // Variaveis: (camel case), Primeira letra da primeira palavra em minuscula, Proximas palavras, a primeira letra é maiuscula e não usamos espaços e nem acentuações.
        int fathersAge = 10; // int idadeDoPai
        long numeroGrande = 100000;
        double salarioDouble = 2000;
        float salarioFloat = 2500;
        byte idadeByte = 10;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 'M'; // Pode utilizar a tabela "ASK" ou "UNICODE"
        String nome = "Goku"; //String não é um tipo primitivo "no java" e sim uma classe de "referencia" (Wrappers)

        System.out.println("A idade do pai no momento do cadastro era de " + fathersAge+ " anos.");
        System.out.println(falso);
        System.out.println("char " + caractere);
        System.out.println("Oi, meu nome é "+nome+"!");
    }
}
