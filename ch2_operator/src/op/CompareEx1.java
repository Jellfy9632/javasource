package op;

// 비교연산자
// 대소비교 : <, >, <=, >=
// 등가비교 ==(eq), !=(not equal)

public class CompareEx1 {
    public static void main(String[] args) {

        // \t (tab)
        // %b (boolean값 출력)
        // 두 변수의 타입이 다른 경우 타입을 맞춘 후 비교
        System.out.printf("10 == 10.0f \t %b\n", 10==10.0f);
        System.out.printf("'0' == 0 \t %b\n", ('0' == 0)); // 48 == 0 -> false
        System.out.printf("'A' == 65 \t %b\n", ('A' == 65)); // 65 == 65 -> true
        System.out.printf("'A' > 'B' \t %b\n", ('A' > 'B')); // 65 > 66 -> false
        System.out.printf("'A'+1 != 'B' \t %b\n", ('A'+1 != 'B')); // 65+1 != 66
        
    }
    
}
