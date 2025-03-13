package api.math;

public class MathEx {
    public static void main(String[] args) {
        System.out.println("random()0~1" + Math.random());

        double val = 90.7552;

        // 올림, 버림, 반올림
        System.out.println("Math.ceil(val)" + Math.ceil(val));
        System.out.println("Math.floor(val)" + Math.floor(val));
        System.out.println("Math.round(val)" + Math.round(val));
        System.out.println("Math.min(x, y)" + Math.min(95, 25));
        System.out.println("Math.max(x, y)" + Math.max(95, 25));
    }

}
