package loop;

public class ForEx5 {
    public static void main(String[] args) {

        // 1~100 수 중에서

        // 1) 3의 배수의 총 합 출력
        int sum = 0, sum1 = 0, sum2 = 0;

        for (int i = 1; i < 101; i++) {
            if (i % 3 == 0) {
                sum += i;
            }

        }
        System.out.printf("3의 배수의 총 합 = %d\n", sum);

        // 2) 3의 배수는 더하고 9의 배수는 뺌

        for (int i = 1; i < 101; i++) {

            if (i % 3 == 0 && i % 9 != 0) {
                sum1 += i;
            }

        }
        System.out.printf("3의 배수중 9와의 공배수가 아닌수의 총 합 = %d\n", sum1);

        // 3) 3의 배수와 5의 배수의 총 합 출력

        for (int i = 1; i < 101; i++) {

            if (i % 3 == 0||i % 5 == 0) {
                sum2 += i;
            }

        }
        System.out.printf("3의 배수 또는 5의 배수인 수의 총합 (공배수는 1번만 가산한다) = %d", sum2);
    }

}
