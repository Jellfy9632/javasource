package condition;

import java.util.Scanner;

public class IfTest8 {
    public static void main(String[] args) {
        // 임금 구하기

        // 시간당 임금
        int rate = 9800;
        int pay, hours;

        // 사용자로부터 근무시간을 입력받아 hours 변수에 담기

        // 근무시간이 8시간 까지는 시간당 임금을 지불함
        // 8시관 초과 근무시에는 시간당 임금의 1.5배를 지불함
        // 임금 계산 후 pay 변수에 담기

        // 최종 출력
        // 받는 임금은 120000 원 입니다

        String input;

        System.out.println("근무시간을 입력하세요");
        Scanner scanner = new Scanner(System.in);
        input = scanner.nextLine();

        hours = Integer.parseInt(input);

        if(hours<=8){
            pay = rate*hours;
        }else{
            int over = hours - 8;
            pay = (int)((rate*8)+(over*rate*1.5));

            System.out.printf("초과근무시간이 %d시간 있습니다.\n", over);
            System.out.printf("기본임금 %d원 + 초과임금 %d원\n", rate*8, (int)(rate*over*1.5));
        }
        
        System.out.printf("받는 임금은 %d 원 입니다.", pay);
    }
    
}
