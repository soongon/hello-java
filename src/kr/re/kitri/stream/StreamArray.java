package kr.re.kitri.stream;

import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class StreamArray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        double[] doubles = {1.0, 2.0, 3.0, 4.0};

        long count = Arrays.stream(numbers).count();
        System.out.println(count);

        DoubleStream stream1 = Arrays.stream(doubles);
    }
}
