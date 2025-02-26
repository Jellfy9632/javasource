package op;

public class ArthmeticEx1 {
    public static void main(String[] args) {
        // 변수선언 - int a(10), b(4)
        int a = 10, b = 4;

        // +, -, *, / (몫)

        System.out.printf("%d + %d =%d\n", a, b, a+b);
        System.out.printf("%d - %d =%d\n", a, b, a-b);
        System.out.printf("%d * %d =%d\n", a, b, a*b);
        System.out.printf("%d / %d =%d\n", a, b, a/b);    
        // 나누기 연산에서 소수점 이하 나머지 결과도 보고싶은 경우 float, double
        // a/(float)b == 10/4.000000

        // a(int) / b(float) ==>타입이 다른 두 변수는 작은쪽의 타입이 큰쪽으로 변환됨
        System.out.printf("%d / %f =%f\n", a, (float)b, a/(float)b);
    }
    
}
