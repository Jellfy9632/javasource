package loop;

import java.util.Scanner;

public class ForEx9 {
    public static void main(String[] args) {

        // * 을 출력할 라인의 수 입력받기

        int count;

        System.out.print("몇 줄을 만들까요? : ");
        Scanner scanner = new Scanner(System.in);
        count = scanner.nextInt();

        for (int i = 1; i < count + 1; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }
            System.out.println();
        }

        scanner.close();
    }

}
