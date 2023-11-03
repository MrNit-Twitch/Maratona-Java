package academy.devdojo.maratonajava.introducao;

public class Aula029_EstruturasDeRepeticaoBreak {
    // Imprima os primeiros 25 numeros de um dado valor. Por exemplo, 50.
    public static void main(String[] args) {
        int valorMax = 50;
        for (int i = 0; i <= 50 ; i++) {
            if (i < 25) {
                System.out.println(i);
                continue;
            }
            System.out.println(i);
        }
    }
}
