package oop;

public class Square {
    // 정사각형
    // 속성 : 변의 길이 (sidLength)
    // 기능 : 면적 구하기
    // 생성자, toString

    int sideLength;

    int getArea() {
        return sideLength * sideLength;
    }

    public Square() {
    }

    public Square(int sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public String toString() {
        return "Square [sideLength=" + sideLength + "]";
    }

}
