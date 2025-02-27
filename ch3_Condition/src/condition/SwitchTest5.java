package condition;

import java.util.Scanner;

public class SwitchTest5 {
    public static void main(String[] args) {
        // 점수(0~100)를 입력받은 후 점수에따라 등급 출력
        // 90이상 A, 80이상 B, 70이상 C, 나머지는 F
        // 98 / 10 = 9

        char grade;
        int score;

        System.out.println("점수를 입력하세요 (0~100):");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        score = Integer.parseInt(input);



        switch (score/10) {
            case 10:
            case 9:
                grade = 'A';
                break;
            case 8:
                grade = 'B';
                break;
            case 7:
                grade = 'C';
                break;

            default:
                grade = 'F';
                break;
        }
        System.out.printf("점수: %d점\n등급: %c", score, grade);

    }

}
