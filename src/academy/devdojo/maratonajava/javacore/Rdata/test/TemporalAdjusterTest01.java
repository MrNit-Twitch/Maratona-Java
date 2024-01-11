package academy.devdojo.maratonajava.javacore.Rdata.test;

import java.time.LocalDate;

public class TemporalAdjusterTest01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = LocalDate.now().with(new TemporalAdjustersTest01.ObterProximoDiaUtil());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = LocalDate.now().withDayOfMonth(15).with(new TemporalAdjustersTest01.ObterProximoDiaUtil());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());
    }
}
