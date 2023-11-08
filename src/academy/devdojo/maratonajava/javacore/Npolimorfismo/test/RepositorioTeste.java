package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.RepositorioArquivo;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.RepositorioBancoDeDados;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.RepositorioMemoria;
import academy.devdojo.maratonajava.javacore.repositorio.Repositorio;

public class RepositorioTeste {
    public static void main(String[] args) {
        Repositorio repositorio1 = new RepositorioArquivo();
        Repositorio repositorio2 = new RepositorioBancoDeDados();
        Repositorio repositorio3 = new RepositorioMemoria();
        repositorio1.salvar();
        repositorio2.salvar();
        repositorio3.salvar();
    }
}
