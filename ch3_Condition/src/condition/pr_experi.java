package condition;

import java.util.Scanner;

public class pr_experi {
    public static void main(String[] args) {
        
        // 변수를 한꺼번에 선언
        // 사용자에게 점수를 입력받아 저장
        // 입력받은 점수 값에 따라 변수 값이 변경되는 조건문 작성
        // 점수가 90점 이상인경우 A 미만인경우 B 출력

        int score = 0, input_num = 0;
        char grade = 'A';
        String input = " ";

        System.out.println("점수 입력");
        Scanner scanner = new Scanner(System.in);
        
        input = scanner.nextLine();
        input_num = Integer.parseInt(input);

        if (input_num>=90) {

            score = (int)input_num;
            grade = 'A';
            
        } else {
            score = (int)input_num;
            grade = 'B';
            
        }

        if (score>=90) {
            System.out.printf("점수: %d\n등급: %c\n", score, grade);
        } else {
            System.out.printf("점수: %d\n등급: %c\n", score, grade);
        }

    }
    
}
