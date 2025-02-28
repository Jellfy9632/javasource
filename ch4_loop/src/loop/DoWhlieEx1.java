package loop;

import java.util.Scanner;

// for, while 과의 차이는 무조건 한 번은 실행되는것이다 (조건검사를 나중에 함)
public class DoWhlieEx1 {
    public static void main(String[] args) {

        // 컴퓨터가 1~100 사이의 임의의 수 생성 / 생성된 숫자 맞추기

        // 1~100사이 정수를 입력받아서 컴퓨터 숫자와 비교 후
        // 더 큰 수 입력 or 더 작은 수 입력 or 정답

        Scanner scanner = new Scanner(System.in);

        int answer = (int) ((Math.random() * 100) + 1);
        int input = 0; // 사용자 답변을 저장하는 변수

        do {
            System.out.print("1~100 사이의 정수를 입력하세요 >> ");
            input = scanner.nextInt();

            if (answer < input) {
                System.out.println("더 작은 수를 입력하세요");
            } else {
                System.out.println("더 큰 수를 입력하세요");
            }

        } while (input != answer);

        System.out.println("정답! 프로그램 종료");
    }

}
