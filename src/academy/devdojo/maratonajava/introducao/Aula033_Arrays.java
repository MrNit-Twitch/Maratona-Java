package academy.devdojo.maratonajava.introducao;

public class Aula033_Arrays {
    public static void main(String[] args) {
        // Valor padrão de atribuições:
        // byte, short, int, long, float e double = 0
        // char = '\u0000'
        // boolean = false
        // String = null

        String[] nomes = new String[3];
        nomes[0] = "Arthos";
        nomes[1] = "Dsilva";
        nomes[2] = "Mouseiro";
        nomes[3] = "Hf";

        for (int i = 0; i < nomes.length ; i++) {
            System.out.println(nomes[i]);
        }
        /*for (int i = 0; i < nomes.length ; i++) {
            if (nomes[i] == null) {
                break;
                System.out.println(nomes[i]);
            }

        }*/
    }
}
