package oop;

import java.util.Arrays;

public class MethodEx {
    public static void main(String[] args) {
        // Method 인스턴스 생성
        Method method1 = new Method();

        // 메서드 호출
        int result = method1.add(15, 25);

        System.out.println("result = " + result);

        float result2 = method1.add2(35, 45.2f);

        System.out.println("result2 = " + result2);

        System.out.println(method1.add(45, 55));

        method1.print("홍길동", "s123"); // 해당하는 메서드의 반환타입이 void인 경우에는 호출만 가능

        int[] arr = { 1, 2, 3, 4, 5 };
        int[] test = method1.arr(arr);
        System.out.println(Arrays.toString(test));
        System.out.println(test[2]);
    }

}
