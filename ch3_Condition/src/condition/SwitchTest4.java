package condition;

import java.util.Scanner;

public class SwitchTest4 {
    public static void main(String[] args) {
        // 가위(1), 바위(2), 보(3)

        // 컴퓨터가 내는 가위, 바위, 보 결정 (무작위)

        int computer = (int) ((Math.random() * 3) + 1);

        // 사용자가 내는 가위, 바위, 보 결정
        Scanner scanner = new Scanner(System.in);
        System.out.println("가위(1), 바위(2), 보(3), 중에서 하나 입력");
        String input = scanner.nextLine();
        int user = Integer.parseInt(input);

        // 2(바위) - 1(가위) = 1 (컴퓨터)
        // 컴퓨터가 이겼습니다, user가 이겼습니다, 비겼습니다.

        int result = computer - user;

        String user_p = " ", pc_p = " ";

        switch (user) {
            case 1:
                user_p = "가위";
                break;
            case 2:
                user_p = "바위";
                break;
            case 3:
                user_p = "보";
                break;
            default:
                user_p = "반칙";
                break;
        }

        switch (computer) {
            case 1:
                pc_p = "가위";
                break;
            case 2:
                pc_p = "바위";
                break;
            case 3:
                pc_p = "보";
                break;
            default:
                break;
        }

        System.out.printf("user: %s vs 컴퓨터 %s\n", user_p, pc_p);

        switch (result) {
            case 1:
            case -2:
                System.out.println("컴퓨터가 이겼습니다");
                break;

            case -1:
            case 2:
                System.out.println("user가 이겼습니다");
                break;
            case 0:
                System.out.println("비겼습니다");
                break;

            default:
                System.out.println("비겁합니다");
                break;
        }

    }

}
