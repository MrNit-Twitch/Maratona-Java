package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Escola;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Professor;

public class EscolaTeste01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Mr.Nit");
        Professor professor2 = new Professor("Arthos");
        Professor[] professores = {professor1, professor2};
        Escola escola = new Escola("NitTwitch", professores);

        escola.imprime();

        /*Refazer a aula do zero
        Criar uma escola e associar dois professores a ela*/
    }
}
