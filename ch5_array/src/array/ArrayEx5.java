package array;

import java.util.Arrays;

public class ArrayEx5 {
    public static void main(String[] args) {
        // char 값 5개

        // 타입 배열명[] = {값1, 값2, 값3...};

        char arr[] = { 'a', 'b', 'c', 'd', 'e' }; // 배열 선언, 생성

        // 배열 길이

        System.out.println("길이 : " + arr.length);

        // 배열 요소 확인

        System.out.println(arr);
        System.out.println(Arrays.toString((arr))); // [a, b, c, d, e]

        // 배열 요소 변경

        arr[2] = 'f';

        System.out.println(Arrays.toString((arr))); // [a, b, c, d, e]

        // double 배열 선언, 생성 (5)

        double arr1[] = new double[5];

        System.out.println(arr1); // [D@6b884d57

        // Arrays.toString() : 배열명이 가리키는 곳의 실제 값을 출력
        System.out.println(Arrays.toString(arr1));

    }

}
