package academy.devdojo.maratonajava.javacore.Oexception.exeption.test;

import java.io.File;
import java.io.IOException;

public class ExeptionTest01 {
    public static void main(String[] args) {
        criarNovoArquivo();
    }
    public static void criarNovoArquivo(){
        File file = new File("D:\\Cursos Programação\\Curso Java\\Aulas\\Aula006\\maratona-java\\arquivo\\teste.txt");
        try {
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo Criado" + isCriado);
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
