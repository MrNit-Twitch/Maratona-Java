package academy.devdojo.maratonajava.introducao;

public class Aula038_ArraysMultiDimencionais {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};

        int[][] arrayInt = new int[3][];

        arrayInt[0] = new int[2];
        arrayInt[1] = array;
        arrayInt[2] = new int[6];

        int[][] arrayInt2 = {{0,0},{1, 2, 3},{1, 2, 3, 4, 5, 6}};

        for (int[] arrayBase : arrayInt2) {
            System.out.println("\n-----"); // \n da um salto de linha no inicio
            for (int num : arrayBase){
                System.out.print(num + " ");
            }
        }
    }
}
