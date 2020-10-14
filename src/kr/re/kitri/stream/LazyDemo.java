package kr.re.kitri.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class LazyDemo {
    public static void main(String[] args) {

        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
        Stream<Integer> stream = integers.stream();
        Stream<Integer> integerStream = stream.filter(e -> e > 2);
        Stream<Integer> integerStream1 = integerStream.map(e -> e * 2);
        integerStream1.forEach(e -> System.out.println(e));

        Arrays.asList(6, 7, 8, 9, 10).stream()
                .filter(e -> e > 7)
                .map(e -> e + 3)
                .forEach(e -> System.out.println(e));

    }
}
