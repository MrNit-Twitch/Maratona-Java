package academy.devdojo.maratonajava.introducao;

public class Aula035_Arrays {
    public static void main(String[] args) {
        int[] numeros = new int[5];
        int[] numeros2 = {5,0,1,2,1};
        int[] numeros3 = new int[]{1,2,3,4,5};

        /*for (int i = 0; i < numeros2.length; i++) {
            System.out.println(numeros2[i]);
        }*/
        for (int num : numeros2) {
            System.out.println(num);
        }
    }
}
