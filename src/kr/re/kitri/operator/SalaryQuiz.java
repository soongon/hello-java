package kr.re.kitri.operator;

import kr.re.kitri.stream.Salary;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.OptionalDouble;

public class SalaryQuiz {
    public static void main(String[] args) throws IOException {
        // 1. 내셔널리그 상위 30명의 연봉의 평균을 구하세요..
        // 2. 2010년 이후 "NYA" 의 상위 5명 연봉의 합을 구하세요..

        // 핵심..
        // 1. 필터링.. 1) NL  2) 2010 이후 연도..
        // 2. sorted..
        // 3. 매핑  Salary -> long(salary)
        // 4. Stream<Long> --> LongStream  (mapToLong)
        // 5. limit(30) limit(5)
        // 6. average(), sum()

        Path file = Path.of("Salaries.csv");

        OptionalDouble nl = Files.lines(file)
                .skip(1)
                //.peek(System.out::println)
                .map(e -> {
                    String[] s = e.split(",");
                    return new Salary(Integer.parseInt(s[0]), s[1], s[2], s[3], Long.parseLong(s[4]));
                })
                .filter(e -> e.getLeague().equals("NL"))
                .sorted((a, b) -> (int) (b.getSalary() - a.getSalary()))
                .mapToLong(e -> e.getSalary())  // Stream<Salary> --> Stream<Long> -->
                .limit(30)
                .average();

        System.out.println(nl.getAsDouble());

        long nya = Files.lines(file)
                .skip(1)
                //.peek(System.out::println)
                .map(e -> {
                    String[] s = e.split(",");
                    return new Salary(Integer.parseInt(s[0]), s[1], s[2], s[3], Long.parseLong(s[4]));
                })
                .filter(e -> e.getYear() >= 2010)
                .filter(e -> e.getTeam().equals("NYA"))
                .sorted((a, b) -> (int) (b.getSalary() - a.getSalary()))
                .mapToLong(e -> e.getSalary())
                .limit(5)
                .sum();

        System.out.println(nya);
    }
}
