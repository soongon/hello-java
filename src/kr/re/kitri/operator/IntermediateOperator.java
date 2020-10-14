package kr.re.kitri.operator;

import kr.re.kitri.stream.Dish;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntermediateOperator {
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
        int sum = dishes.stream()
                .distinct()
                //.peek(System.out::println)
                .filter(Dish::isVegeterian)
                .mapToInt(e -> e.getCalrories())
                .sorted()
                //.peek(e -> System.out.println(e))
                .sum();

        System.out.println("result is " + sum);

    }
}
