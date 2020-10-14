package kr.re.kitri.stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class StreamFile {
    public static void main(String[] args) throws IOException {

        Path file = Path.of("Salaries.csv");

        // 아메리칸 리그의 연봉 탑5를 출력
        // 1. 아메리칸리그 필터링
        // 2. 연봉순으로(내림차순으로 정렬)
        // 3. limit(5)
        // 4. 출력..
        Files.lines(file)
                .skip(1)
                //.peek(System.out::println)
                .map(e -> {
                    String[] s = e.split(",");
                    return new Salary(Integer.parseInt(s[0]), s[1], s[2], s[3], Long.parseLong(s[4]));
                })
                .filter(e -> e.getLeague().equals("AL"))
                .sorted((a, b) -> (int) (b.getSalary() - a.getSalary()))
                .limit(5)
                .forEach(System.out::println);
    }
}
