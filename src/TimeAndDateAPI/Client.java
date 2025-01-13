package TimeAndDateAPI;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Set;

public class Client {
    public static void main(String[] args) {
      //1.Local Date
        LocalDate now=LocalDate.now();
        System.out.println(now);
        LocalDate customDate=LocalDate.of(2022, 2, 23);
        int dayOfMonth=now.getDayOfMonth();
        Month month=now.getMonth();
        int year=now.getYear();
        System.out.println(customDate);
        System.out.println(dayOfMonth);
        System.out.println(month);
        System.out.println(year);

        //2.LocalTime
        LocalTime now1=LocalTime.now();
        System.out.println(now1);

        //3.LocalDateTime
        LocalDateTime now2=LocalDateTime.now();
        System.out.println(now2);

        //4.ZonedDateTime
        //Universal time coordinated
        //24 Zones
        ZonedDateTime now3=ZonedDateTime.now();
        System.out.println(now3);
        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
        availableZoneIds.forEach(System.out::println);

        //5.Instant
        //epoch time
        long currentTimeMillis = System.currentTimeMillis();
        System.out.println(currentTimeMillis);
        Instant now5=Instant.now();
        System.out.println(now5);

        //6.Duration
        //PT : period of Time
        //output will be in terms of seconds
        Instant start=Instant.now();
        Instant end=Instant.now();
        Duration d1=Duration.between(start,end);
        System.out.println(d1);

        Instant Start=Instant.now();
        int sum=0;
        for(int i=0;i<100897;i++){
            sum+=i;
        }
        Instant End=Instant.now();
        Duration d2=Duration.between(Start,End);
        System.out.println(d2);

        //7.Period
        //when we have large dates like 10 years we wont use Duration instead we use Period
        //output will in terms of days month and years
        LocalDate localDate1=LocalDate.now();
        LocalDate localDate2 = LocalDate.of(2022, 4, 23);
        System.out.println(Period.between(localDate1, localDate2));

        //8. DateTimeFormatter
        //to print date and time in our own format
        LocalDateTime localDateTime=LocalDateTime.now();
        System.out.println(localDateTime);
        //String to local time
        String Date="24/04/2024";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate localDate=LocalDate.parse(Date,dateTimeFormatter);
        System.out.println(localDate);
    }
}
