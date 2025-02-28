package loop;

public class BreakEx1 {
    public static void main(String[] args) {
        // break : switch, 반복문 중지 포함된 가장 가까운 반복문 탈출

        int sum = 0, i = 0;

        while (true) {
            // if : 실행 할 구문이 하나인 경우 {} 생략가능
            // sum이 100보다 크면 멈춤
            if (sum > 100) {
                break;
            }
            ++i;
            sum += i;

        }

        System.out.printf(" i = %d, sum  %d=", i, sum);
    }

}
