package re.coinup;

import java.util.Scanner;

public class Game1 {
    public static void main(String[] args) {
        boolean run = true;
        int coin = 10000;
        while (run) {

            int num;
            String htChoice = "", coinHt = "";
            Scanner sc = new Scanner(System.in);

            System.out.println("========================================");
            System.out.printf("현재 보유중인 코인 : %d 개\n", coin);
            System.out.println("========================================");
            delay();
            System.out.println("앞/뒷면을 선택하세요");
            System.out.println("========================================");
            System.out.println("1. 앞면 | 2. 뒷면 | 3. 종료");
            num = Integer.parseInt(sc.nextLine());
            switch (num) {
                case 1:
                    htChoice = "앞";
                    break;
                case 2:
                    htChoice = "뒷";
                    break;

                case 3:
                    delay();
                    System.out.println("게임 종료");
                    run = !run;
                    System.exit(0);
                default:
                    delay();
                    System.out.println("잘못된 입력");
                    break;

            }
            delay();
            System.out.println("코인을 던집니다");
            if ((int) (Math.random() * 2) == 1) {
                coinHt = "앞";
            } else {
                coinHt = "뒷";
            }
            delay();
            System.out.println();
            delay();
            System.out.printf("선택 : %s면, 결과 : %s면", htChoice, coinHt);
            System.out.println();
            if (htChoice.equals(coinHt)) {
                delay();
                System.out.println("승리! 코인 두배!");
                coin = (int) coin * 2;
            } else {
                delay();
                System.out.println("패배.. 코인 절반 손실..");
                coin = (int) coin / 2;
            }
        }

    }

    static void delay() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
