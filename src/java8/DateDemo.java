package java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;

public class DateDemo {

    public static void main(String[] args) {
        Date date = new Date();

        System.out.println(date);
        System.out.println(System.currentTimeMillis());

        LocalDate localDate = LocalDate.now().minusDays(1);
        LocalDate localDate1 = LocalDate.now();
        System.out.println(localDate);
        System.out.println(localDate.getMonth());
        System.out.println(localDate1.isAfter(localDate));


        System.out.println();
        ZoneId zoneId = ZoneId.of("Asia/Kolkata");
        System.out.println(zoneId);

        LocalDate localDate2 = LocalDate.now(zoneId);
        LocalTime localTime = LocalTime.now(zoneId);
        System.out.println(localDate2);
        System.out.println(localTime);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
    }
}
