package op;

public class ArthmeticEx2 {
    public static void main(String[] args) {
        // 변수선언 - int a(10), b(4)
        byte a = 10, b = 4;
        // byte,short 연산 수행 시 연산의 결과가 int 형으로 변경 됨
        
        // *byte c1 = a + b;

        // byte 타입인 변수 a, b를 +연산 하는 경우 결과가 int 타입이 되어
        // byte 타입 변수선언이 불가능하다

        // 해결책 1) 변수 c 의 타입을 int로 만든다
        
        int c1 = a + b;

        // 해결책 2) 연산 결과 값이 =128 ~ 127 사이라면
        // a + b 의 값을 (a + b)로 묶어 byte 타입으로 캐스팅한다

        byte c2 = (byte)(a + b);

        System.out.println(c1);

    }
    
}