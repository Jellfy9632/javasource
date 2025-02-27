package condition;

import java.util.Scanner;

public class pr_experi3 {
    public static void main(String[] args) {
        // 연산자, 피연산자 입력받은 후 계산해서 결과를 출력
        // +, -, *, /, %

        // 출력문: 5 - 3 = 2

        int num1, num2, result = 0;
        String calc;

        Scanner scanner = new Scanner(System.in), scanner2 = new Scanner(System.in);

        System.out.println("계산 할 숫자를 입력하세요");
        num1 = scanner.nextInt();

        System.out.println("계산 방식을 입력하세요.\n1) 더하기: +\t2) 빼기: -\n3) 곱하기: *\t4) 나누기: /\n5) 나머지값: %");
        calc = scanner2.nextLine();

        System.out.println("계산 받을 숫자를 입력하세요");
        num2 = scanner.nextInt();


        switch (calc) {
            case "+": case "1":
                result = num1 + num2;
                calc = "+";
                break;
            case "-": case "2":
                result = num1 - num2;
                calc = "-";
                break;
            case "*": case "3":
                result = num1 * num2;
                calc = "*";
                break;
            case "/": case "4":
                result = num1 / num2;
                calc = "/";
                break;
            case "%": case "5":
                result = num1 % num2;
                calc = "%";
                break;
            default:
                System.out.println("계산 방식을 잘못 입력했습니다");
                System.exit(0); // 프로그램 종료
                break;
                
        }

        System.out.printf("%d %s %d = %d", num1, calc, num2, result);


    }

}
