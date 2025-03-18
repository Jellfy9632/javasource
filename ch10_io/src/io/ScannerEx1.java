package io;

import java.util.Scanner;

public class ScannerEx1 {
    public static void main(String[] args) {
        // 키보드 입력
        // 1) InputStream
        // 2) Scanner

        Scanner sc = new Scanner(System.in);
        System.out.println("숫자 입력 : ");
        int num = sc.nextInt(); // 5 엔터
        System.out.println("연산자 입력 (+, -, *, /): ");
        // String op = sc.nextLine(); // 줄 단위
        String op = sc.next();
        System.out.println("숫자 입력 : ");
        int num2 = sc.nextInt();

        // 숫자 입력 :
        // 5
        // 연산자 입력 (+, -, *, /):
        // 숫자 입력 :
        // 6

        sc.nextLine();
        sc.nextLine();

        // sc.next();

    }

}
