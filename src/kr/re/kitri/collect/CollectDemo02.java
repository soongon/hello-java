package kr.re.kitri.collect;

import kr.re.kitri.stream.Dish;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.*;

public class CollectDemo02 {
    static List<Dish> dishes = Arrays.asList(
            new Dish("pork", false, 800, "MEAT"),
            new Dish("beef", false, 700, "MEAT"),
            new Dish("chicken", false, 450, "MEAT"),
            new Dish("french fires", true, 530, "OTHER"),
            new Dish("rice", true, 300, "OTHER"),
            new Dish("spagetti", true, 400, "NOODLE"),
            new Dish("apple", true, 300, "FRUIT"),
            new Dish("melon", true, 320, "FRUIT"),
            new Dish("salmon", true, 420, "FISH"),
            new Dish("prawn", true, 410, "FISH")
    );
    public static void main(String[] args) {
        // 요리타입으로 그룹핑 한 후 각 칼로리의 평균을 구하세요. (그룹핑 한 후에 집계)
        Map<String, IntSummaryStatistics> collect = dishes.stream()
                .collect(groupingBy(e -> e.getType(), summarizingInt(e -> e.getCalrories())));

        collect.forEach((key, value) -> {
            System.out.print("type: " + key);
            System.out.println("  calrories: " + value.getAverage());
        });
    }
}
