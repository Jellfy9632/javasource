package condition;

import java.util.Scanner;

public class pr_experi2 {
    public static void main(String[] args) {
        // 맛 별 과일 구분
        // 맛을 입력받아 판별
        // 맛에 해당하는 과일 출력
        // 변수는 한번에 전부 선언
        // 조건에 따라 변수가 변동 되도록 구성

        String fruit = " ", u_in = " ";
        char flav_f_cmp = ' ', flav1 = '단', flav2 = '신';

        System.out.println("먹은 과일은 무슨 맛이었나요?\n1. 단, 2. 신, 3. 쓴 4. 짠");

        Scanner scanner = new Scanner(System.in);
        u_in = scanner.nextLine();
        flav_f_cmp = u_in.charAt(0);
        

        if ((flav_f_cmp==flav1)) {
            fruit = "딸기";    
        }else if((flav_f_cmp==flav2)){
            fruit = "레몬";
        }else{
        }

        if((flav_f_cmp==flav1)||(flav_f_cmp==flav2)) {
            System.out.printf("당신이 먹은 과일은 %s 입니다.", fruit);
        }else{
            System.out.println("그런 맛이 나는 과일은 없습니다.");
        
        }

    }
    
}
