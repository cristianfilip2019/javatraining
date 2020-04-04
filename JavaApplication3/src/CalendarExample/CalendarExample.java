/*
 * Test calendar examples
 */
package CalendarExample;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.MonthDay;
import java.time.Period;
import java.time.YearMonth;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.HashSet;
import java.util.Locale;

/**
 * Test calendar examples
 * @author servi
 */
public class CalendarExample {

    public static void main(String[] args) {
        //DayOfWeek and Month enums
        DayOfWeek dow = DayOfWeek.MONDAY;
        Month month = Month.MAY;
        Locale locale = Locale.getDefault();
        System.out.println(dow.getDisplayName(TextStyle.FULL, locale));
        System.out.println(month.getDisplayName(TextStyle.FULL, locale));
        
        //LocalDate, Year, Month classes
        LocalDate date = LocalDate.of(2000, Month.MAY, 15);
        LocalDate nextWed = date.with(TemporalAdjusters.next(DayOfWeek.WEDNESDAY));
        System.out.println(nextWed);
        YearMonth dateOne = YearMonth.now();
        System.out.printf("%s:%d%n", date, date.lengthOfMonth());
        MonthDay dateTwo = MonthDay.of(Month.MAY, 15);
        System.out.println(dateTwo);
        
        //LocalTime, LocalDateTime classes
        LocalTime thisSec = LocalTime.now();
        System.out.println("Local time: " + thisSec.getHour() + "H" + 
                thisSec.getMinute() + "M" + thisSec.getSecond() + "S");
        //ZoneId and ZoneOffset classes
        HashSet<String> zones = (HashSet<String>) ZoneId.getAvailableZoneIds();
        for(String zone:zones){
            System.out.println("Zone: " + zone);
        }
        //Zoned DateTime
        LocalDateTime leaving = LocalDateTime.of(2013,Month.JULY,20,19,30);
        ZoneId leavingZone = ZoneId.of("Europe/Bucharest");
        ZonedDateTime departure = ZonedDateTime.of(leaving, leavingZone);
        ZoneId arrivingZone = ZoneId.of("Europe/Paris");
        ZonedDateTime arrival = departure.withZoneSameInstant(arrivingZone).plusMinutes(210);
        System.out.println("Flying from: " + departure + " to " + arrival);
        
        //Instant class for Timestamp of machine
        Instant timestamp = Instant.now();
        System.out.println("Timestamp is" + timestamp);
        //Duration between 2 instances
        Instant t1 = Instant.now();
        //Generate a delay
        for (String zone:zones){
            System.out.println("Zone: " + zone);
        }
        //new instant
        Instant t2 = Instant.now();
        long ns = Duration.between(t1, t2).toNanos();
        System.out.println("Duration: " + ns);
        //Period
        LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.of(1968, Month.MAY, 7);
        Period p = Period.between(birthday, today);
        long p2 = ChronoUnit.DAYS.between(birthday, today);
        System.out.println("you are " + p.getYears() + " years " + p.getMonths() + 
                " months, and " + p.getDays() + " days old.(" + p2 + " days total)");   
    }
}
