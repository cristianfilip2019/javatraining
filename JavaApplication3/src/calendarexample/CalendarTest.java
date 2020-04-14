
package calendarexample;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class CalendarTest {

    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.of(1984, Month.SEPTEMBER, 17);
        Period p = Period.between(birthday, today);
        long p2 = ChronoUnit.DAYS.between(birthday, today);
        System.out.println("you are " + p.getYears() + " years " + p.getMonths() + 
                " months, and " + p.getDays() + " days old.(" + p2 + " days total)");
    }
}
