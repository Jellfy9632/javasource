package oop;

// static 메서드 : 클래스 메서드

public class PrimitiveParamEx {
    public static void main(String[] args) {

        // main 메서드

        Data d = new Data();
        d.x = 100;

        System.out.println("main() : x = " + d.x);
        // change(d.x);
        change2(d);
        System.out.println("After change() ");
        System.out.println(d.x);
        // PrimitiveParamEx obj = new PrimitiveParamEx();
        // obj.change();
    }

    // 매개변수 : 기본타입
    static void change(int x) {
        x = 10000;
        System.out.println("change() : x = " + x);

    }

    // 변수 : 객체타입
    static void change2(Data d) {
        d.x = 10000;
        System.out.println("change() : x = " + d.x);

    }

}
