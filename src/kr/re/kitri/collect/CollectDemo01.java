package kr.re.kitri.collect;

import kr.re.kitri.stream.Dish;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectDemo01 {
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
        // 각 요리타입으로 분류하여 반환
        Map<String, List<Dish>> collect = dishes.stream()
                .collect(Collectors.groupingBy(Dish::getType));

        List<Dish> meat = collect.get("MEAT");
        System.out.println(meat.size());
    }
}
