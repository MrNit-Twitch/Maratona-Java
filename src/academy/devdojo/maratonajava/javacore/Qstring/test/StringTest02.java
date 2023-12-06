package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringTest02 {
    public static void main(String[] args) {
        String nome = "  Luffy  ";
        String numero = "012345";
        System.out.println(nome.charAt(3));
        System.out.println(nome.length());
        System.out.println(nome.replace("y","i"));
        System.out.println(nome.toLowerCase());
        System.out.println(nome.toUpperCase());
        System.out.println(numero.substring(3,numero.length()));
        System.out.println(nome.trim());
    }
}
