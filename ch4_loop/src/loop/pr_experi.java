package loop;

import java.util.Scanner;

public class pr_experi {
    public static void main(String[] args) {

        // 입력 받은 숫자에 해당하는 네모를 칠하기

        // 변수선언

        String fi = "■", emp = "□", ui_t = " ";
        int ui = 0;

        // 입력받기

        System.out.print("몇 번 째 네모를 칠하시겠습니까? : ");
        Scanner scanner = new Scanner(System.in);
        ui_t = scanner.nextLine();
        ui = Integer.parseInt(ui_t);

        if ((ui > 9) || (ui < 1)) {
            System.out.println("1~9 사이의 수를 입력해 주세요");
        }

        else {

            for (int i = 1; i < 4; i++) {
                if (i != ui) {
                    System.out.printf("%s", emp);
                } else {
                    System.out.printf("%s", fi);
                }
            }
            System.out.println();

            for (int i = 4; i < 7; i++) {
                if (i != ui) {
                    System.out.printf("%s", emp);
                } else {
                    System.out.printf("%s", fi);
                }
            }
            System.out.println();

            for (int i = 7; i < 10; i++) {
                if (i != ui) {
                    System.out.printf("%s", emp);
                } else {
                    System.out.printf("%s", fi);
                }
            }
            System.out.println();
        }

    }
}
