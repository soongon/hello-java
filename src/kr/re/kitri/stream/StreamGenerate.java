package kr.re.kitri.stream;

import java.util.stream.Stream;

public class StreamGenerate {
    public static void main(String[] args) {
        // 무한 스트림
        Stream.generate(Math::random)
                .limit(10)
                .forEach(System.out::println);
    }
}
