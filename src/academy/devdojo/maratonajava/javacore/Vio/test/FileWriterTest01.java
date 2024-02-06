package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest01 {
    // File
    // FileWriter
    // FileReader
    //BufferWriter
    //BufferReader
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (FileWriter fw = new FileWriter(file, true)) {
            fw.write("Mr Nit, todos os dias, de segunda a sexta as 3:10 da tarde.\nVenha estudar programação junto com a nossa galera.\n");
            fw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
