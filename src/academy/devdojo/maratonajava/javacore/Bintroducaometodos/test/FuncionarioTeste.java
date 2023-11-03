package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraFuncionario;

public class FuncionarioTeste {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Jack");
        funcionario.setIdade(22);
        funcionario.setSalario(new double[] {2522.78,2879.55,3158.30,4785.98});

        ImpressoraFuncionario impressora = new ImpressoraFuncionario();
        impressora.imprimir(funcionario);
        funcionario.setMedia(1000);
        System.out.println("Media alterada " + funcionario.getMedia());

    }
}
