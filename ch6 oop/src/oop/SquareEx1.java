package oop;

import java.util.Arrays;

public class SquareEx1 {
    public static void main(String[] args) {

        Square square = new Square();
        square.sideLength = 15;

        System.out.println(square);

        Square square2 = new Square(20);
        System.out.println(square2);
        System.out.println("면적 = " + square2.getArea());

        // 타입 배열명[] = new 타입[5];
        // 타입 배열명[] = {x, y, z, ...};

        // 객체배열
        // 객체(클래스)명 배열명 = new 객체(클래스)명[5];

        Square squareArr[] = new Square[5];
        squareArr[0] = new Square(15);
        squareArr[1] = new Square(5);
        squareArr[2] = new Square(9);
        squareArr[3] = new Square(8);
        squareArr[4] = new Square(12);
        System.out.println(Arrays.toString(squareArr));

        // System.out.println("첫번째사각형 면적 = " + squareArr[0].getArea());
        // System.out.println("두번째사각형 면적 = " + squareArr[1].getArea());
        // System.out.println("세번째사각형 면적 = " + squareArr[2].getArea());
        // System.out.println("네번째사각형 면적 = " + squareArr[3].getArea());
        // System.out.println("다섯번째사각형 면적 = " + squareArr[4].getArea());

        for (int i = 0; i < squareArr.length; i++) {
            System.out.printf("%d번 사각형 면적 = %d\n", (i + 1), squareArr[i].getArea());
        }

        // 배열 기본타입으로 생성
        // 정수형 - 0, 실수형 - 0.0, 불린형 - false

        int arr[] = new int[5];
        arr[0] = 15;
        arr[1] = 12;
        arr[2] = 9;
        arr[3] = 13;
        arr[4] = 6;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}
