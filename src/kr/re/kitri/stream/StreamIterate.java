package kr.re.kitri.stream;

import java.util.stream.Stream;

public class StreamIterate {
    public static void main(String[] args) {
        // infinite stream
        Stream.iterate(0, e -> e + 2)
                .limit(10)
                .forEach(System.out::println);
    }
}
