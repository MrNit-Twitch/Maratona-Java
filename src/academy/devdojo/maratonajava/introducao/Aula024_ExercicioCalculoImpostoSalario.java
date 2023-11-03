package academy.devdojo.maratonajava.introducao;

public class Aula024_ExercicioCalculoImpostoSalario {
    public static void main(String[] args) {
        double pay = 70000;
        String Tax;

        if (pay <= 34712) {
            Tax = String.valueOf(pay * 9.7 / 100);
        } else if (pay >= 34713 && pay <= 68507)  {
            Tax = String.valueOf(pay * 37.35 / 100);
        } else {
            Tax = String.valueOf(pay * 49.50 / 100);
        }
        System.out.println("O imposto relativo ao pagamento citado será de: €" + Tax);
    }
}
