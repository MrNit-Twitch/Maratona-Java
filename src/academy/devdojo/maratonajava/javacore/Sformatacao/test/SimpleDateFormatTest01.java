package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest01 {
    public static void main(String[] args) {
        String mascara = "'Brasil, dia' dd 'de' MMMM 'de' yyyy 'as' HH 'horas' mm 'minutos e' ss 'segundos.'";
        SimpleDateFormat sdf = new SimpleDateFormat(mascara);
        System.out.println(sdf.format(new Date()));
        try {
            System.out.println(sdf.parse("Brasil, dia 12 de dezembro de 2023 as 16 horas 16 minutos e 49 segundos."));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
