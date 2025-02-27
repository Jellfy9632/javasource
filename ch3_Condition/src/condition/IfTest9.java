package condition;

import java.util.Scanner;

public class IfTest9 {
    public static void main(String[] args) {
        // 윤년, 평년 구하기
        // 년도를 입력받기

        // 입력받은 년도가 윤년인지 평년인지 출력
        // 윤년조건
        // 1). 년도를 4로 나눈 나머지가 0 이고, 년도를 100으로 나눈 나머지가 0이 아닐 것
        // 2). 년도를 400으로 나눈 나머지가 0 일 것

        int year;
        char ch1;
        String input;

        System.out.println("년도를 입력 하십시오");
        Scanner scanner = new Scanner(System.in);
        input = scanner.nextLine();
        year = Integer.parseInt(input);

        if (((year%4==0)&&(year%100 != 0))||(year%400==0)) {

            ch1 = '윤';
            
        }
        else{

            ch1 = '평';
        }

        System.out.printf("%c년", ch1);
    }
    
}
