package academy.devdojo.maratonajava.introducao;

public class Aula027_EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        // while, do while, for
        int count = 0;
        while (count < 10) {
            System.out.println(++count);
        }

        System.out.println("");

        count = 0;
        do {
            System.out.println("dentro do do-while " + ++count);
        } while (count < 10);

        for (int i = 0; i <= 10; i++) {
            System.out.println("For " + i);
        }

        /* Para usar uma variavel global dentro da estrutura "FOR"
        count = 0;
        for (;count <= 10; count++) {
            System.out.println("For " + count);
        }*/

    }
}
