package maze;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class start {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("미로 시작");
        try {
            TimeUnit.SECONDS.sleep(1); // 1초 동안 지연
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("갈림길이다...");
        try {
            TimeUnit.SECONDS.sleep(1); // 1초 동안 지연
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("1. 왼쪽으로 간다 / 2. 오른쪽으로 간다");
        try {
            TimeUnit.SECONDS.sleep(1); // 1초 동안 지연
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String ui = sc.nextLine();
        switch (ui) {
            case "1":
                System.out.println("");
                System.out.println("함정이다!!");
                System.out.println("식인 상어에게 잡아 먹혔다\nGame Over");
                break;

            case "2":
                System.out.println();
                System.out.println("함정이다!!");
                System.out.println("독가스를 들이마셔 죽고말았다\nGame Over");
                break;

            case "3":
                System.out.println();
                System.out.println();

            default:
                System.out.println();
                System.out.println("바른 길을 고르지 못하고 머뭇거리다가\n뒤에서 덮쳐온 가시벽에 찔려 죽고말았다\nGame Over");
                break;
        }
    }

}
