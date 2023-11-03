package academy.devdojo.maratonajava.introducao;

public class Aula021_EstruturasCondicionais {
    public static void main(String[] args) {
        // idade < 15 categoria infantil
        // idade >= 15 && idade < 18 categoria juvenil
        // idade >= 18 categoria adulto
        int idade = 33;
        String categoria;

        if (idade < 15) {
            categoria = "Categoria Infantil";
        } else if (idade >= 15 && idade < 18) {
            categoria = "Categoria Juvenil";
        } else {
            categoria = "Categoria Adulto";
        }
        System.out.println(categoria);

        /* "caso eu queira usar variavel simples"
        int idade = 15;
        if (idade < 15) {
            System.out.println("Categoria Infantil");
        } else if (idade >= 15 && idade < 18) {
            System.out.println("Categoria Juvenil");
        } else {
            System.out.println("Categoria Adulto");
        }*/

        /* "Caso eu quiser criar as variaveis Booleanas"
        int idade = 30;
        boolean infantil = idade < 15;
        boolean juvenil = idade >= 15 && idade < 18;
        if (infantil) {
            System.out.println("Categoria Infantil");
        } else if (juvenil) {
            System.out.println("Categoria Juvenil");
        } else {
            System.out.println("Categoria Adulto");
        }
        */
    }
}
