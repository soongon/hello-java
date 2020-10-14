package kr.re.kitri.stream;

import java.util.stream.LongStream;

public class StreamRange {
    public static void main(String[] args) {
        LongStream.rangeClosed(1, 100)
                .forEach(System.out::println);

    }
}
