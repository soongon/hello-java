package kr.re.kitri.collect;

import kr.re.kitri.stream.Salary;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Collectors;

public class CollectMaxMin {

    public static void main(String[] args) throws IOException {
        Path file = Path.of("Salaries.csv");
        Salary salary = Files.lines(file)
                .skip(1)
                //.peek(System.out::println)
                .map(e -> {
                    String[] s = e.split(",");
                    return new Salary(Integer.parseInt(s[0]), s[1], s[2], s[3], Long.parseLong(s[4]));
                })
                .max((a, b) -> (int) (a.getSalary() - b.getSalary()))
                .get();

        System.out.println(salary);
    }
}
