package academy.devdojo.maratonajava.javacore.Rdata.test;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.util.Calendar;
import java.util.Date;

public class LocalDataTest01 {
    public static void main(String[] args) {
        System.out.println(new Date());
        System.out.println(Calendar.getInstance());
        System.out.println(Month.JANUARY.getValue());
        LocalDate date = LocalDate.of(2023,Month.JANUARY,27);
        LocalDate agora = LocalDate.now();
        System.out.println(date.getYear());
        System.out.println(date.getMonth());
        System.out.println(date.getMonthValue());
        System.out.println(date.getDayOfWeek());
        System.out.println(date.getDayOfMonth());
        System.out.println(date.lengthOfMonth());
        System.out.println(date.lengthOfYear());
        System.out.println(date.isLeapYear());
        System.out.println(date.get(ChronoField.YEAR));
        System.out.println(date.get(ChronoField.DAY_OF_YEAR));
        System.out.println(date);
        System.out.println(LocalDate.MIN);
        System.out.println(LocalDate.MAX);
    }

    public static class LocalTimeTest01 {
        public static void main(String[] args) {
            LocalTime time = LocalTime.of(23,32,12);
            LocalTime timeNow = LocalTime.now();
            System.out.println(time);
            System.out.println(timeNow);
            System.out.println(timeNow.getHour());
            System.out.println(timeNow.getMinute());
            System.out.println(timeNow.getSecond());
            System.out.println(timeNow.get(ChronoField.HOUR_OF_DAY));
            System.out.println(LocalTime.MIN);
            System.out.println(LocalTime.MAX);
        }
    }
}
