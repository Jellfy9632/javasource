package array;

import java.util.Scanner;

public class ArrayEx16 {
    public static void main(String[] args) {
        String[][] words = {
                { "chair", "의자" },
                { "computer", "컴퓨터" },
                { "integer", "정수" },
        };

        // Q1. words[0][0] 의 뜻은? 의자
        // 정답입니다. (words[0][1].equals(사용자 입력값))
        // Q2. words[1][0] 의 뜻은? 의자
        // 틀렸습니다. 정답은 컴퓨터입니다.
        // Q3. words[2][0] 의 뜻은? 의자

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < words.length; i++) {
            System.out.printf("Q.%d %s의 뜻은?: ", i + 1, words[i][0]);
            String answer = scanner.nextLine();
            if (words[i][1].equals(answer)) {
                System.out.println("정답입니다.");
            } else {
                System.out.printf("틀렸습니다.\n정답은 %s입니다\n", words[i][1]);
            }
        }

    }

}
