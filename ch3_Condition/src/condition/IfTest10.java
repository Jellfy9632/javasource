package condition;

import java.util.Scanner;

public class IfTest10 {
    public static void main(String[] args) {
        // 세 개의 숫자를 입력받아 입력받은 수 중 가장 큰 수와 가장 작은 수 출력

        int num1, num2, num3, max, min;
        String input;

        System.out.println("첫 번째 수 입력");
        Scanner scanner = new Scanner(System.in);
        input = scanner.nextLine();
        num1 = Integer.parseInt(input);

        System.out.println("두 번째 수 입력");
        input = scanner.nextLine();
        num2 = Integer.parseInt(input);

        System.out.println("세 번째 수 입력");
        input = scanner.nextLine();
        num3 = Integer.parseInt(input);

        min = num1;
        if(min > num2){
            min = num2;
        }
        if(min > num3){
            min = num3;
        }


        max = num1;
        if(max < num2){
            max = num2;
        }
        if(max < num3){
            max = num3;
        }

        System.out.printf("가장 큰 수 = %d, 가장 작은 수 = %d", max, min);
    }
    
}
