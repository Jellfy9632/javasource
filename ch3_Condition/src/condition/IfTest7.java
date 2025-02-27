package condition;

import java.util.Scanner;

public class IfTest7 {
    public static void main(String[] args) {
        // if 예제 만들기
        // num1 이라는 변수 선언 후 임의의 값 담기
        // 사용자로부터 입력을 받아 num1이라는 변수에 담고
        // num1 이 짝수인지 홀수인지 출력하기

        // 작성한코드
        int num1;
        char ch1 = ' ';

        System.out.println("정수를 입력하세요");
        Scanner scanner = new Scanner(System.in);
        num1 = scanner.nextInt();

        if (num1%2==0) {

            ch1 = '짝';
            
        }else{

            ch1 = '홀';
        }


        System.out.printf("%c수\n", ch1);

        }

    }