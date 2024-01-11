package academy.devdojo.maratonajava.javacore.Rdata.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.*;

public class TemporalAdjustersTest01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = now.plusDays(2);
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = now.withDayOfMonth(19);
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = LocalDate.now().with(TemporalAdjusters.nextOrSame(DayOfWeek.THURSDAY));
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.THURSDAY));
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = LocalDate.now().with(TemporalAdjusters.previous(DayOfWeek.THURSDAY));
        System.out.println(now);
        System.out.println(now.getDayOfWeek());
    }

    static class ObterProximoDiaUtil implements TemporalAdjuster {
        @Override
        public Temporal adjustInto(Temporal temporal) {
            DayOfWeek dayOfWeek = DayOfWeek.of(temporal.get(ChronoField.DAY_OF_WEEK));
            int addDays;
            switch (dayOfWeek) {
                case MONDAY:
                    addDays = 0;
                    break;
                case TUESDAY:
                    addDays = 6;
                    break;
                case WEDNESDAY:
                    addDays = 5;
                    break;
                case THURSDAY:
                    addDays = 4;
                    break;
                case FRIDAY:
                    addDays = 3;
                    break;
                case SATURDAY:
                    addDays = 2;
                    break;
                default:
                    addDays = 1;
            }
            return temporal.plus(addDays, ChronoUnit.DAYS);
        }
    }
}
