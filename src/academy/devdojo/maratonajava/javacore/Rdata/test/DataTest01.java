package academy.devdojo.maratonajava.javacore.Rdata.test;

import java.util.Date;

public class DataTest01 {
    public static void main(String[] args) {
        Date date = new Date(1701887294162L); //Long 100000
        date.setTime(date.getTime() + 3_600_000);
        System.out.println(date);
    }
}
