package academy.devdojo.maratonajava.introducao;

public class Aula020_EstruturasCondicionais {
    public static void main(String[] args) {
        int idade = 15;
        boolean isAutorizadoComprarBebida = idade >= 18;

        if (isAutorizadoComprarBebida) {
            System.out.println("Autorizado a comprar bebida alcólica.");
        } else {
            System.out.println("Não autorizado a comprar bebida alcólica");
        }

        /* "Se não" feito fora do "IF"
        if (!isAutorizadoComprarBebida) {
            System.out.println("Não autorizado a comprar bebida alcólica");
        }*/

        System.out.println("Fora do If");
    }
}
