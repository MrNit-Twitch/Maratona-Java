package academy.devdojo.maratonajava.javacore.Oexception.error.test;

public class StackOverflowTest01 {
    public static void main(String[] args) {
        /*recursividade();
        * causa um ERRO*/
    }
    public static void recursividade(){
        recursividade();
    }
}
