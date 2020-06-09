/*
        public class CalendarTest
        needs 4 imports
        includes main method
 */
package calendarexample;

/*LocalDate is an immutable date-time object that represents a date,
often viewed as year-month-day. Other date fields, such as day-of-year,
day-of-week and week-of-year, can also be accessed.
For example, the value "2nd October 2007" can be stored in a LocalDate.
 */
import java.time.LocalDate;
/*Month is an enum representing the 12 months of the year - January, February, March, April, May,
        June, July, August, September, October, November and December.
 */
import java.time.Month;
//A date-based amount of time in the ISO-8601 calendar system, such as '2 years, 3 months and 4 days'.
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class CalendarTest {

        public static void main(String[] args) {
                // variable of type LocalDate that stores today's date by calling the now() of LocalDate class
                LocalDate today = LocalDate.now();
                //variable of type LocalDate that stores a specific date by passing an argument with specific format of date 
                //to of() of LocalDate class              
                LocalDate birthdayDarius = LocalDate.of(2017, Month.JUNE, 12);
                //variable of type LocalDate that stores a specific date by passing an argument with specific format of date 
                //to of() of LocalDate class                 
                LocalDate birthdayCristi = LocalDate.of(1984, Month.SEPTEMBER, 17);
                //variable of type Period that stores a period by passing 2 arguments(a variable that stores a date
                // and today's date) to between() of Period class
                Period pDarius = Period.between(birthdayDarius, today);
                Period pCristi = Period.between(birthdayCristi, today);
                //variable of type long that stores a number of days by passing 2 arguments(a variable that stores a date
                // and today's date) to between() of ChronoUnit with the ENUM constant DAYS
                long daysDarius = ChronoUnit.DAYS.between(birthdayDarius, today);
                //variable of type long that stores a number of weeks by passing 2 arguments(a variable that stores a date
                // and today's date) to between() of ChronoUnit with the ENUM constant WEEKS
                long weeksDarius = ChronoUnit.WEEKS.between(birthdayDarius, today);
                long daysCristi = ChronoUnit.DAYS.between(birthdayCristi, today);
                long weeksCristi = ChronoUnit.WEEKS.between(birthdayCristi, today);
                System.out.println("Today's date " + today);
                System.out.println("Darius are " + pDarius.getYears() + " ani " + pDarius.getMonths()
                        + " luni si " + pDarius.getDays() + " zile.(" + daysDarius + " days total)");
                System.out.println("Weeks Darius " + weeksDarius);
                System.out.println("Cristi are " + pCristi.getYears() + " ani " + pCristi.getMonths()
                        + " luni si " + pCristi.getDays() + " zile.(" + daysCristi + " days total)");
                System.out.println("Weeks Cristi " + weeksCristi);
        }
}
