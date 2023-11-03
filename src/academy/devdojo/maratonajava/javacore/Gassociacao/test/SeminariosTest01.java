package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Estudantes;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Local;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Professores;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Seminarios;

import java.util.Scanner;

public class SeminariosTest01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Seminarios seminario01 = new Seminarios("Associações em Java");
        Seminarios seminario02 = new Seminarios("Usando Arrays de forma correta");
        Seminarios seminario03 = new Seminarios("Como ajudar um streamer perdido");
        Seminarios[] seminarios = {seminario01,seminario02, seminario03};

        Estudantes estudante01 = new Estudantes("Mr Nit", 39);
        Estudantes estudante02 = new Estudantes("Arthos", 42);
        Estudantes estudante03 = new Estudantes("Tallyto", 27);
        Estudantes[] semi01 = {estudante01};
        Estudantes[] semi02 = {estudante02, estudante03};
        Estudantes[] semi03 = {};

        Professores professor01 = new Professores("Syodoto", seminario01.getNome(), seminario03.getNome());
        Professores professor02 = new Professores("Mouseiro", "Array");
        Professores[] professores = {professor01, professor02};

        Local local = new Local("Av. Twitch de Souza, Nº666");

        seminario01.setEstudantes(semi01);
        seminario03.setEstudantes(semi02);

        seminario01.setProfessores(professor01);
        seminario02.setProfessores(professor02);
        seminario03.setProfessores(professor01);

        seminario01.setLocal(local);
        seminario02.setLocal(local);
        seminario03.setLocal(local);

        seminario01.imprime();
        seminario02.imprime();
        seminario03.imprime();

        //Arrumar o contador para aluno 01 e 02
        //Utilizar scanner para imprimir
        //mostrar idades e especialidades

        //Boas praticas: evitar plural em nomes de classes ou variaveis
    }
}
