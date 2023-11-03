package academy.devdojo.maratonajava.javacore.Npolimorfismo.domino;

public class Computador extends Produto implements Taxavel {
    public static final double IMPOSTO_POR_CENTO = 0.21;
    public Computador(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto do Computador");
        return this.valor * this.IMPOSTO_POR_CENTO;
    }
}
