package oop;

public class MinicalcEx {
    public static void main(String[] args) {
        // print() 메소드 호출
        // 클래스 메서드(or변수)이기 때문에 객체생성없이 클래스이름. 으로 호출가능
        MiniCalc.print();
        System.out.println(MiniCalc.k);

        // execute() 호출

        MiniCalc calc = new MiniCalc();
        calc.execute();
        calc.a = 1;
        calc.b = 3;

    }

}
