package loop;

import java.util.Scanner;

public class ForEx6 {
    public static void main(String[] args) {
        // 팩토리얼 구하기
        // 입력받은 숫자의 팩토리얼 구하기
        // 4를 입력받아서 4! (4*3*2*1)의 값을 구한 뒤 출력하기

        int fact = 1;

        System.out.print("팩토리얼을 구할 숫자를 입력하세요 : ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int count = Integer.parseInt(input);

        for (int i = 1; i < count+1 ; i++) {

            fact *= i;
            
        }

        System.out.printf("%d! = %d", count, fact);

    }

}
