package stream;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class StreamEx6 {
    public static void main(String[] args) {
        IntStream stream = IntStream.rangeClosed(1, 10);

        // 2의 배수 개수
        // i%2==0
        long cnt = stream.filter(i -> i % 2 == 0).count();
        System.out.println("2의 배수 개수 " + cnt);

        // 2의배수평균
        stream = IntStream.rangeClosed(1, 10);
        OptionalDouble d = stream.filter(i -> i % 2 == 0).average();
        System.out.println("2의배수 평균" + d);

        // 2의 배수 최대값
        stream = IntStream.rangeClosed(1, 10);
        OptionalInt opt = stream.filter(i -> i % 2 == 0).max();
        System.out.println("2의배수 최대값" + opt);

        // 2의 배수 최소값
        stream = IntStream.rangeClosed(1, 10);
        OptionalInt opt2 = stream.filter(i -> i % 2 == 0).min();
        System.out.println("2의배수 최소값" + opt2);

        // 2의 배수의 최소값

        int sum = stream.filter(i -> i % 2 == 0).sum();
        System.out.println("의 배수의 합 : " + sum);

    }

}
