package extend;

// 클래스간의 관계
// 1) 상속관계 : isa
// 2) 포함관계 : hasa
// 한 클래스 안에 다른 클래스가 멤버 변수로 선언된 상황

// 관계 결정하기
// public class Circle extends Point {}
// extends : 원 (Circle)은 점(Point) 이다 : Circle is a Point
// 포함 : 원 (Circle)은 점(Point)을 가지고 있다 : Circle has a Point

// Car, SportsCar
// Sports 는 Car 이다 (O)
// Sports Car 는 Car 를 가지고 있다 (X)
// 
public class Circle extends Shape {
    // int x;
    // int y;
    Point point; // 멤버 변수 선언

    int r;

    public Circle() {
    }

    public Circle(Point point, int r) {
        this.point = point;
        this.r = r;
    }

    void draw() {
        System.out.printf("[center =(%d,%d), r = %d, color = %s]\n", point.x, point.y, r, color);
    }

}