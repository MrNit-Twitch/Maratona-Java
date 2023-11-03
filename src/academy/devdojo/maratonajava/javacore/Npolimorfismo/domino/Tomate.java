package academy.devdojo.maratonajava.javacore.Npolimorfismo.domino;

public class Tomate extends Produto implements Taxavel{
    private String dataDeValidade;
    public static final double IMPOSTO_POR_CENTO = 0.6;
    public Tomate(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto do Tomate");
        return this.valor * this.IMPOSTO_POR_CENTO;
    }

    public String getDataDeValidade() {
        return dataDeValidade;
    }

    public void setDataDeValidade(String dataDeValidade) {
        this.dataDeValidade = dataDeValidade;
    }
}
