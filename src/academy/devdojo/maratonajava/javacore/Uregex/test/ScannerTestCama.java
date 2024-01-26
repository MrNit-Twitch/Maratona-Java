package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.Scanner;

public class ScannerTestCama {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        leia.useDelimiter(",");
        //String texto = "Levi,Eren,Mikasa,true,200";
        String[] arr = new String[6];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = leia.nextLine();
        }
        for (String teste : arr) {

            System.out.println(teste);
        }
    }
}
