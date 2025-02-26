package op;

import java.util.Scanner;

// true && true ==> true (둘 모두 true여야 true)
// true || false ==> true (둘 중 하나만 true 라면 결과값은 true)
// !true ==> false
// !false ==> true

public class IogicalEx2 {
    public static void main(String[] args) {

        // 사용자로부터 문자를 입력받은 후 그 문자가
        // 숫자인지 아니면 영문자인지 판별하는 프로그램

        Scanner scanner = new Scanner(System.in);
        System.out.println("문자를 하나 입력하세요");

        String input = scanner.nextLine();

        // charAt()
        // 문자열을 문자로 분해하여 돌려받는 메소드
        // "abc" => "abc".charAt(0) : a, "abc".charAt(1) : b
        // index는 0번부터 시작
         char ch = input.charAt(0);
         
         if ('0' <= ch && ch <='9') {

            System.out.println("입력하신 문자는 숫자입니다");
            
         }
         if (('a' <= ch && ch <='z')||('A' <= ch && ch<='Z'))  {
         
            System.out.println("입력하신 문자는 영문자입니다");
            
         }

         if(('z'<=ch && ch<='z')||('A'<=ch&&ch<='Z')){

            System.out.println("입력하신 문자는 영문자입니다");
         }

         

    }

    
}
