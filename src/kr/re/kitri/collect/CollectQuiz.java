package kr.re.kitri.collect;

import kr.re.kitri.stream.Salary;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectQuiz {
    public static void main(String[] args) throws IOException {
        // 연봉 레벨로 그루핑하기
        // 1. 100만불 미만은 "LOW"
        // 2. 100만불 에서 1000만불 까지는 "NORMAL"
        // 3. 1000만불 이상은 "HIGH"
        // 4. 옵션은 각각의 그룹의 평균 연봉을 구하세요..
        Path file = Path.of("Salaries.csv");
        Map<String, DoubleSummaryStatistics> collect = Files.lines(file)
                .skip(1)
                //.peek(System.out::println)
                .map(e -> {
                    String[] s = e.split(",");
                    return new Salary(Integer.parseInt(s[0]), s[1], s[2], s[3], Long.parseLong(s[4]));
                })
                .filter(e -> e.getYear() == 2016)
                .collect(Collectors.groupingBy(e -> {
                    if (e.getSalary() < 1_000_000) {
                        return "LOW";
                    } else if (e.getSalary() < 10_000_000) {
                        return "NORMAL";
                    } else {
                        return "HIGH";
                    }
                }, Collectors.summarizingDouble(Salary::getSalary)));

        System.out.println(collect.get("LOW").getCount());
    }
}
