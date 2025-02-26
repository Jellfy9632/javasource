package op;

import java.util.Scanner;

public class ScannerEx1 {
    public static void main(String[] args) {
        // 키보드로 입력받기
        // System.in : 키보드, System.out : 화면
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("두 자리 정수 입력");
        // 사용자가 입력한 값을 input 변수에 담기
        // nextline() : 문자열로 받아옴
        String input = scanner.nextLine();

        // "45" ==> 45
        int num = Integer.parseInt(input); // 입력받은 값을 정수형으로 받아옴 *암기할것
        System.out.println("입력값:"+num);
        
        scanner.close();

        int A = 15;

    }
    
}
