package js;

import java.util.Scanner;

public class sl {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String RI = "슬라임";
        int ui, patp;
        String[] skill = new String[4];

        System.out.printf(" %s 이/가 나타났다", RI);
        System.out.println();
        System.out.println("행동 선택");
        System.out.print("1. 공격 2. 기술 3. 가방 4. 도망:");

        ui = sc.nextInt();
        patp = 5;
        skill[0] = "강력베기";

        switch (ui) {
            case 1:
                System.out.printf(" %s 은/는 %d 의 데미지를 입었다.", RI, patp);
                System.out.println();

                break;

            case 2:

                System.out.printf("기술 선택\n 1. %s\n 2. %s\n 3. %s\n 4. %s\n", skill[0], skill[1], skill[2], skill[3]);
                System.out.println();
                ui = sc.nextInt();
                switch (ui) {
                    case 1:
                        System.out.printf("당신은 %s를 사용했다!\n", skill[0]);
                        break;

                    default:
                        break;
                }
                break;

            default:
                break;
        }
    }

}
