package kr.re.kitri.datetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjuster01 {
    public static void main(String[] args) {
        LocalDate theDay = LocalDate.of(1945, 8, 15);

        System.out.println(theDay
                .with(TemporalAdjusters.next(DayOfWeek.WEDNESDAY))
                .with(TemporalAdjusters.next(DayOfWeek.WEDNESDAY)));
    }
}
