package academy.devdojo.maratonajava.javacore.Rdata.test;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTest01 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime aniversario = LocalDateTime.of(1983, Month.SEPTEMBER, 27, 12,0,0);
        System.out.println(ChronoUnit.DAYS.between(aniversario, now));
        System.out.println(ChronoUnit.MONTHS.between(aniversario, now));
        System.out.println(ChronoUnit.MINUTES.between(aniversario, now));
    }
}
