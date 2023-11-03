package academy.devdojo.maratonajava.introducao;

public class Aula026_ExercicioSwitch {
    public static void main(String[] args) {
        // Dados os valores de 1 a 7, imprima se é dia útil ou final de semana
        // Considerando 1 como domingo
        int opt = 8;
        String Day = "";
        switch (opt) {
            case 1:
                Day = "Domingo";
                break;
            case 2:
                Day = "Segunda-Feira";
                break;
            case 3:
                Day = "Terça-Feira";
                break;
            case 4:
                Day = "Quarta-Feira";
                break;
            case 5:
                Day = "Quinta-Feira";
                break;
            case 6:
                Day = "Sexta-Feira";
                break;
            case 7:
                Day = "Sábado";
                break;
        }
        if (opt == 1 || opt == 7) {
            System.out.println(Day + " faz parte do FINAL DE SEMANA");
        } else if (opt >= 2 && opt <= 6) {
            System.out.println(Day + " faz parte DA SEMANA");
        } else {
            System.out.println("Opção Inválida, tente um numero entre 1 e 7.");
        }

        //        switch (dia) {
//            case 1:
//            case 7:
//                System.out.println("É fim de semana");
//                break;
//            case 2:
//            case 3:
//            case 4:
//            case 5:
//            case 6:
//                System.out.println("Não é fim de semana");
//                break;
//            default:
//            System.out.println("Opção Inválida, tente um numero entre 1 e 7.");
//                break;

//        }

        /* "A partir da versão Java 14"
        int dia = 1;
        String mensagem = switch (dia) { case 1,7 -> "Fim de semana"; case 2,3,4,5,6 -> "Dia de semana"; default -> "dia invalido"; };System.out.println(mensagem);
*/
    }
}
