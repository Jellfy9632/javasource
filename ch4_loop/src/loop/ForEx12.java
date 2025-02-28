package loop;

public class ForEx12 {
    public static void main(String[] args) {
        // 4x + 5y = 60 을 만족하는 를 출력
        // x, y는 10 이하의 자연수
        // (5,3) 예시

        int x, y;

        for (x = 1; x < 11; x++) {
            for (y = 1; y < 11; y++) {
                if (((4 * x) + (5 * y)) == 60) {
                    System.out.printf("(%d, %d)\n", x, y);
                }
            }
        }
    }
}
