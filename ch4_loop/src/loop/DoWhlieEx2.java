package loop;

import java.util.Scanner;

// for, while 과의 차이는 무조건 한 번은 실행되는것이다 (조건검사를 나중에 함)
public class DoWhlieEx2 {
    public static void main(String[] args) {

        // 문자 입력받은 후 출력
        // q가 입력되면 종료

        Scanner scanner = new Scanner(System.in);
        String input;
        System.out.print("문자를 입력하세요: ");

        do {
            System.out.println("q입력시 종료");
            input = scanner.nextLine();
            System.out.printf("출력: %s\n", input);

        } while (!input.equalsIgnoreCase("q")); // == , != =>equals, equalsIgnorecase

        System.out.println("프로그램 종료");
    }

}
