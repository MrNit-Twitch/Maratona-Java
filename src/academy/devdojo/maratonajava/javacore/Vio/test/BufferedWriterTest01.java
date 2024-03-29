package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (FileWriter fw = new FileWriter(file, true);
             BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write("Venha estudar com a gente aqui na Twitch.");
            bw.newLine();
            bw.write("Todos os dias a partir das 3:10.");
            bw.newLine();
            bw.flush();
        } catch (
                IOException ex) {
            ex.printStackTrace();
        }
    }
}
