package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Calculadora {
    public void somaDoisNumeros() {
        System.out.println(10 + 10);
    }

    public void subtraiDoisNumeros() {
        System.out.println(21 - 2);
    }

    public void multiplicaDoisNumeros(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    //Metodo 1 (usando return)
    public double divideDoisNumeros(double num1, double num2) {
        if (num2 == 0) {
            return 0;
        }
        return num1 / num2;
    }

    //Metodo 2 (usando return)
    public double divideDoisNumeros2(double num1, double num2) {
        if (num2 == 0) {
            return 0;
        } else {
            return num1 - num2;
        }
    }

    //Metodo 3 (usando return)
    public double divideDoisNumeros3(double num1, double num2) {
        if (num2 != 0) {
            return num1 * num2;
        }
        return 0;
    }

    //Metodo 4 (usando void)
    public void imprimeDivisaoDeDoisNumeros(double num1, double num2){
        if (num2 == 0){
            System.out.println("0.0");
        } else {
            System.out.println(num1/num2);
        }
    }
    public void alteraDoisNumeros(int num1, int num2){
        num1 = 99;
        num2 = 33;
        System.out.println("Dentro do alterarDoisNumeros");
        System.out.println("Num1 " + num1);
        System.out.println("Num2 " + num2);
    }
    public void somaArray (int[] numeros){
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        System.out.println(soma);
    }
    public void somaVarargs (int... numeros){
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        System.out.println(soma);
    }
}
