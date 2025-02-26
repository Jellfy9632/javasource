package op;

// 논리연사자 :비교 연산자를 여러개 연결 -> true, false
// && (and), || (or), ! (not)

// x가 4보다 작거나 10보다 크다
// x < 4 || x > 10

// x는 10보다 크고 20보다 작다
// x > 10 && x < 20

// y는 2의배수 또는 3의 배수이다
// y % 2 == 0 | | y % 3 == 0

// y는 2의 배수 또는 3의 배수이지만, 6의 배수는 아니다
// (y % 2 == 0 ) || (y % 3 == 0 ) && (y % 6 ! = 0)

public class IogicalEx1 {
    public static void main(String[] args) {

        int x = 0;
        char ch = ' ';
        x = 15;
        System.out.printf("x=%2d, 10 < x && x < 20 = %b\n", x, 10 < x && x < 20);

        // 2의 배수 또는 3의 배수이지만 6의 배수는 아니다
        x = 6;
        System.out.printf("x=%2d, x%%2==0 || x%%3==0 && x%%6!=0 = %b\n", x, (x % 2==0 || x % 3==0) && x%6!=0);
        
        // '0'~'9'의 숫자인지 확인
        ch = '1';
        System.out.printf("ch=%c, '0' <= ch && ch <= '9' = %b\n", ch, '0' <= ch && ch <='9');
        
        // 소문자인지 확인
        ch = 'a';
        System.out.printf("ch=%c, 'a' <= ch && ch <= 'z' = %b\n", ch, 'z' <= ch && ch <='z');

        // 대문자인지 확인
        ch = 'A';
        System.out.printf("ch=%c, 'A' <= ch && ch <= 'Z' = %b\n", ch, 'A' <= ch && ch <='Z');

        // ch가 소문자 q 이거나 대문자 Q 인지 확인
        ch = 'q';
        System.out.printf("ch=%c, 'q' <= ch || ch <= 'Q' = %b\n", ch, 'q' <= ch || ch <='Q');
        
        System.out.printf("ch=%c, 'q' <= ch || ch <= 'Q' = %b\n", ch, !('q' <= ch || ch <='Q'));
    

    }

    
}
