package academy.devdojo.maratonajava.introducao;

public class Aula030_ExercicioRepeticaoBreak {
    // Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado.
    // Condição: valorParcela >= 1000
    // Frase: Este veiculo poderá ser parcelado em até x parcelas de x reais.
    public static void main(String[] args) {
        double price = 50000;

        for (int portion = 1; portion <= price; portion++) {
            double total = price / portion;
            if (total < 1000) {
                System.out.println("Valor da parcela é inferior ao valor minimo permitido! Tente um valor maior.");
                break;
            }
            System.out.println("Este veiculo poderá ser parcelado em até " + portion + " parcelas de " + total + " reais.");
        }

        /*for (int portion = 1; portion <= price; portion++) {
            double total = price / portion;
            if (total >= 1000) {
                System.out.println("Este veiculo poderá ser parcelado em até " + portion + " parcelas de " + total + " reais.");
            } else {
                System.out.println("Valor da parcela é inferior ao valor minimo permitido! Tente um valor maior.");
                break;
            }
        }*/

    }
}
