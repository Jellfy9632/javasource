package js;

import java.util.Scanner;

public class sl {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String RI = "슬라임";
        int ui, patp;

        System.out.printf(" %s 이/가 나타났다", RI);
        System.out.println("\n행동 선택");
        System.out.print("1. 공격 2. 기술 3. 가방 4. 도망:");

        ui = sc.nextInt();
        patp = 5;

        switch (ui) {
            case 1:
                System.out.printf(" %s 은/는 %d 의 데미지를 입었다.", RI, patp);
                break;

            case 2:

                System.out.printf("기술 선택\n 1. %s\n 2. %s\n 3. %s\n 4. %s\n", RI, RI, RI, RI);
                break;

            default:
                break;
        }
    }

}
