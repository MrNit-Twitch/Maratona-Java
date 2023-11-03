package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome = "Theobaldo";
        estudante01.idade = 16;
        estudante01.sexo = 'M';

        estudante02.nome = "Januaria";
        estudante02.idade = 18;
        estudante02.sexo = 'F';

        estudante.imprimir();
        estudante01.imprimir();
        estudante02.imprimir();
    }
}
