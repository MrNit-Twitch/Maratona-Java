package academy.devdojo.maratonajava.javacore.Rdata.test;

import java.time.*;
import java.time.chrono.JapaneseDate;
import java.util.Map;

public class ZoneTest01 {
    public static void main(String[] args) {
        Map<String, String> shortIds = ZoneId.SHORT_IDS;
        System.out.println(shortIds);
        System.out.println(ZoneId.systemDefault());
        ZoneId tokyoZone = ZoneId.of("Asia/Tokyo");
        System.out.println(tokyoZone);
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        ZonedDateTime zonedDateTime = now.atZone(tokyoZone);
        System.out.println(zonedDateTime);

        Instant nowIntant = Instant.now();
        System.out.println(nowIntant);
        ZonedDateTime zonedDateTime2 = nowIntant.atZone(tokyoZone);
        System.out.println(zonedDateTime2);

        System.out.println(ZoneOffset.MIN);
        System.out.println(ZoneOffset.MAX);

        ZoneOffset offSetManaus = ZoneOffset.of("-04:00");
        OffsetDateTime offsetDateTime1 = now.atOffset(offSetManaus);
        System.out.println(offsetDateTime1);
        OffsetDateTime offsetDateTime2 = OffsetDateTime.of(now, offSetManaus);
        System.out.println(offsetDateTime2);

        OffsetDateTime offsetDateTime3 = nowIntant.atOffset(offSetManaus);
        System.out.println(offsetDateTime3);

        JapaneseDate japaneseDate = JapaneseDate.from(LocalDate.now());
        System.out.println(japaneseDate);
        LocalDate qualEra = LocalDate.of(1900, 9, 27);
        JapaneseDate japaneseEra = JapaneseDate.from(qualEra);
        System.out.println(japaneseEra);
    }
}
