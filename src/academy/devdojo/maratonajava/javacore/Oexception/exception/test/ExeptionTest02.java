package academy.devdojo.maratonajava.javacore.Oexception.exception.test;

import java.io.File;
import java.io.IOException;

public class ExeptionTest02 {
    public static void main(String[] args) throws IOException{
        criarNovoArquivo();
    }
    public static void criarNovoArquivo() throws IOException{
        File file = new File("D:\\Cursos Programação\\Curso Java\\Aulas\\Aula006\\maratona-java\\arquivo\\teste.txt");
        try {
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo Criado" + isCriado);
        } catch (IOException e){
            e.printStackTrace();
            throw e; /*throw new RuntimeException("Problema na hora de criar o arquivo.");
             porem, é preciso tirar o "throws IOException" já que foi criado um novo objeto,
             aos invez de utilizar o proprio "e"*/
        }
    }
}
