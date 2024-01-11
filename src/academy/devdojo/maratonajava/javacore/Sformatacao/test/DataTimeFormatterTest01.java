package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DataTimeFormatterTest01 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        String s1 = date.format(DateTimeFormatter.BASIC_ISO_DATE); //20240109
        String s2 = date.format(DateTimeFormatter.ISO_DATE); //2024-01-09
        String s3 = date.format(DateTimeFormatter.ISO_LOCAL_DATE); //2024-01-09
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println();

        LocalDate parse1 = LocalDate.parse("20240109", DateTimeFormatter.BASIC_ISO_DATE);
        LocalDate parse2 = LocalDate.parse("2024-01-09", DateTimeFormatter.ISO_DATE);
        LocalDate parse3 = LocalDate.parse("2024-01-09", DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(parse1);
        System.out.println(parse2);
        System.out.println(parse3);
        System.out.println();

        LocalDateTime now = LocalDateTime.now();
        String s4 = now.format(DateTimeFormatter.ISO_DATE_TIME); //2024-01-09T15:50:35.2759569
        System.out.println(s4);
        LocalDateTime parse4 = LocalDateTime.parse("2024-01-09T15:50:35.2759569", DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(parse4);
        System.out.println();

        //dd/MM/yyyy
        //MM/dd/yyyy
        //yyyy/MM/dd
        DateTimeFormatter formatterBr = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formatBr = LocalDate.now().format(formatterBr); //09/01/2024
        System.out.println(formatBr);
        DateTimeFormatter formatterAm = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String formatAm = LocalDate.now().format(formatterAm); //01/09/2024
        System.out.println(formatAm);
        DateTimeFormatter formatterJp = DateTimeFormatter.ofPattern("yyyy//MM/dd");
        String formatJp = LocalDate.now().format(formatterJp); //2024//01/09
        System.out.println(formatJp);
        System.out.println();

        LocalDate parseBr = LocalDate.parse("09/01/2024", formatterBr);
        System.out.println(parseBr);
        LocalDate parseAm = LocalDate.parse("01/09/2024", formatterAm);
        System.out.println(parseAm);
        LocalDate parseJp = LocalDate.parse("2024//01/09", formatterJp);
        System.out.println(parseJp);
        System.out.println();

        DateTimeFormatter formatterGr = DateTimeFormatter.ofPattern("dd.MMMM.yyyy", Locale.GERMANY);
        String formatGr = LocalDate.now().format(formatterGr); //09.Januar.2024
        System.out.println(formatGr + "\n");

        LocalDate parseGr = LocalDate.parse("09.Januar.2024", formatterGr);
        System.out.println(parseGr);

    }
}
