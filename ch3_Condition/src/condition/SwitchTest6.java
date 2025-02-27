package condition;

import java.util.Scanner;

public class SwitchTest6 {
    public static void main(String[] args) {
        // 연산자, 피연산자 입력받은 후 계산해서 결과를 출력
        // +, -, *, /, %

        // 출력문: 5 - 3 = 2

        int num1, num2, result = 0;
        String input, calc;

        System.out.println("계산 할 숫자를 입력하세요");
        Scanner scanner = new Scanner(System.in);
        input = scanner.nextLine();
        num1 = Integer.parseInt(input);

        System.out.println("계산 방식을 입력하세요.\n1) 더하기: +\t2) 빼기: -\n3) 곱하기: *\t4) 나누기: /\n5) 나머지값: %");
        Scanner scanner2 = new Scanner(System.in);
        input = scanner2.nextLine();
        calc = input;

        System.out.println("계산 받을 숫자1를 입력하세요");
        Scanner scanner3 = new Scanner(System.in);
        input = scanner3.nextLine();
        num2 = Integer.parseInt(input);

        switch (calc) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
            case "%":
                result = num1 % num2;
                break;
            default:
                System.out.println("계산 방식을 잘못 입력했습니다");
                System.exit(0); // 프로그램 종료
                break;
                
        }

        System.out.printf("%d %s %d = %d", num1, calc, num2, result);


    }

}
