package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) {
        try {
            System.out.println(divisao(1, 0));
        } catch (RuntimeException e){
            e.printStackTrace();
        }
        System.out.println("Código finalizado");
    }

    /**
     *
     * @param a
     * @param b
     * @return
     */
    public static int divisao(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Argumento ilegal, não pode ser \"0\"");
        }
        return a / b;

        /*try {
            return a / b;
        } catch (ArithmeticException e){
            e.printStackTrace();
        }
        return 0;*/
    }
}
