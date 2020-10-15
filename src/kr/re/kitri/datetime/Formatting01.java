package kr.re.kitri.datetime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Formatting01 {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년MM월dd일 E");

        String format = formatter.format(LocalDate.of(2019, 12, 25));

        System.out.println(format);
    }
}
