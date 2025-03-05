package oop;

public class TrianglEx {
    public static void main(String[] args) {

        // default 생성자로 생성
        Triangle triangle = new Triangle();
        // 인스턴스변수 초기화(입력)
        triangle.baseline = 15.2;
        triangle.height = 3.7;

        System.out.printf("면적 = %.2f\n", triangle.getArea());

        // 값 2개를 초기화(입력) 하며 생성
        Triangle triangle2 = new Triangle(12.6, 7.8);
        System.out.printf("면적 = %.2f\n", triangle2.getArea());
    }

}
