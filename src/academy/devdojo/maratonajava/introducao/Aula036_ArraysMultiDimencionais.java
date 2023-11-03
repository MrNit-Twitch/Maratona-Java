package academy.devdojo.maratonajava.introducao;

public class Aula036_ArraysMultiDimencionais {
    public static void main(String[] args) {
        //0,1,2,3,4 Meses (considere que Janeiro é o mes 0)
        //31,28,31,30,31 dias
        int[][] mesDias = new int[4][4];
        mesDias[0][0] = 31;
        mesDias[0][1] = 28;
        mesDias[0][2] = 31;
        mesDias[0][3] = 30;

        mesDias[1][0] = 31;
        mesDias[1][1] = 28;
        mesDias[1][2] = 31;
        mesDias[1][3] = 30;

        mesDias[2][0] = 31;
        mesDias[2][1] = 28;
        mesDias[2][2] = 31;
        mesDias[2][3] = 30;

        mesDias[3][0] = 31;
        mesDias[3][1] = 28;
        mesDias[3][2] = 31;
        mesDias[3][3] = 30;

        for (int m = 0; m < mesDias.length; m++) {
            for (int d = 0; d < mesDias[0].length; d++) {
                System.out.println(mesDias[m][d]);

            }

        }
    }
}
