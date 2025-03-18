package oop;

public class Triangle {

    // 속성 : 밑변(baseline),높이(height)

    double baseline, height;

    // 기능 : 면적을 구한다 - getArea()

    double getArea() {
        return baseline * height / 2.0;
    }

    public Triangle() {
    }

    // 생성자 목적
    // 인스턴스 변수 초기화
    public Triangle(double baseline, double height) {
        this.baseline = baseline;
        this.height = height;
    }

}
