package op;

public class ArthmeticEx3 {
    public static void main(String[] args) {
        
        // char 형 변수의 연산

        char c1 = 'a';
        char c2 = c1;
        char c3 = ' ';

        //  byte, short, char 연산 수행 시 연산의 결과가 int 형으로 변경 된다

        // c1 + 1 은 int 형이기 때문에 char 형 변수 c3에 대입되는 항에서 연산할 수 없다
        
        // 해결책 1) 연산결과를 대입시킬 변수를 int 형으로 선언한다
        int result = c1 + 1;

        // 해결책 2) 연산한 뒤의 값을 char 형으로 캐스팅한다
        c3 = (char)(c1 + 1);

        c2++; // c2 = c2 + 1;
        c2++; // c2 = c2 + 1;

        System.out.println("c1 = "+ c1);
        System.out.println("c2 = "+ c2); // c ※ c2는 char형 변수이므로 출력값은 문자
        System.out.println("result = "+ result); // 98 ※ c1 (a) 의 인코딩 결과 97+1=98
        System.out.println("c3 = "+ c3); // b ※ 91+1=98의 문자형 디코딩 결과 b

    }
    
}