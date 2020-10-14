package kr.re.kitri.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DishHandlerModern {
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
    //칼로리 400 이하인 요리를 칼로리 순으로 정렬하여 상위 3개의 이름을 출력..
    public static void main(String[] args) {
        List<String> result = dishes.stream()
                .filter(dish -> dish.getCalrories() <= 400)
                .sorted((a, b) -> b.getCalrories() - a.getCalrories())
                .map(dish1 -> dish1.getName())
                .collect(Collectors.toList());

        System.out.println(result.subList(0, 3));

    }
}
