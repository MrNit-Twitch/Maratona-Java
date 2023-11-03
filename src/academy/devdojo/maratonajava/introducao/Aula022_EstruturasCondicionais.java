package academy.devdojo.maratonajava.introducao;

public class Aula022_EstruturasCondicionais {
    public static void main(String[] args) {
        //Doar se salario > 5000
        double salario = 5001;
        String mensagemDoar = "Eu vou doar 500 pro DevDojo";
        String mensagemNaoDoar = "Ainda não tenho condições, mas vou ter!";
        // condição ? opção true : opção false;
        String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;
        /* Alternativa não usual para mais IFs no codigo => condição ? opção true : condição ? : opção true : opção false;
        idade < 15 ? "Infantil" : idade >= 15 && idade <18 ? "Juvenil" : "Adulto";
         */
        System.out.println(resultado);
    }
}
