package kr.re.kitri.datetime;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;

public class DateTime02 {
    public static void main(String[] args) {
        LocalDate theDay = LocalDate.of(2019, 12, 25).minusDays(5).plusWeeks(2);

        LocalDate theDay2 = LocalDate.of(1919, 3, 1)
                .plus(3, ChronoUnit.WEEKS)
                .minus(5, ChronoUnit.DAYS);

        boolean after = theDay2.isBefore(theDay);
        System.out.println(after);
        Period until = theDay.until(theDay2);
    }
}
