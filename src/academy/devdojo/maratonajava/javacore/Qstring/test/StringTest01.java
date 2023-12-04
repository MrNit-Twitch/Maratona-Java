package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringTest01 {
    public static void main(String[] args) {
        String nome = "Willian"; // String constant pool
        String nome2 = "Willian";
        String nome3 = new String("Willian");
        String nome4 = new String(nome + " Tavares");

        nome = nome.concat(" Suane"); // nome+= " Suane"
        System.out.println("Nome " + nome);
        System.out.println("Nome2 " + nome2);
        System.out.println("Nome3 " + nome3);
        System.out.println("Nome4 " + nome4);
        System.out.println(nome == nome2);
        System.out.println(nome == nome3);
        System.out.println(nome2 == nome3);
        System.out.println(nome2 == nome3.intern());
    }
}
