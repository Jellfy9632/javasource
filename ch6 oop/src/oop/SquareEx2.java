package oop;

import java.util.Arrays;

public class SquareEx2 {
    public static void main(String[] args) {

        Square squareArr[] = new Square[5];

        // 객체 배열 초기화
        // squareArr[0] = new Square(6);
        // squareArr[1] = new Square(5);
        // squareArr[2] = new Square(4);
        // squareArr[3] = new Square(3);
        // squareArr[4] = new Square(2);

        for (int i = 0; i < squareArr.length; i++) {
            squareArr[i] = new Square();

        }
        // sideLength 값 부여
        squareArr[0].sideLength = 35;
        squareArr[1].sideLength = 5;
        squareArr[2].sideLength = 12;
        squareArr[3].sideLength = 27;
        squareArr[4].sideLength = 13;

        for (int i = 0; i < squareArr.length; i++) {
            System.out.printf("%d번 사각형 면적 = %d\n", (i + 1), squareArr[i].getArea());
        }
    }

}
