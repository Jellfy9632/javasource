package re.coinup;

import java.util.Scanner;

public class run {
    public static void main(String[] args) {
        boolean run = true;

        while (run) {
            System.out.println("코인 게임!");
            System.out.println("====================================");
            System.out.println("1.시작 | 2.충전 | 3.확인 | 4.종료");
            System.out.println("====================================");
            System.out.print("선택 : ");
            Scanner sc = new Scanner(System.in);
            int num = Integer.parseInt(sc.nextLine());
            switch (num) {
                case 1:

                    break;
                case 4:
                    System.out.println("게임 종료");
                    sc.close();
                    System.exit(0);
                default:
                    break;
            }
        }

    }

}
