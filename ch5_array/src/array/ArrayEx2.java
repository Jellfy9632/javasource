package array;

import java.util.Arrays;

public class ArrayEx2 {
    public static void main(String[] args) {

        // 길이가 10인 int형 배열 생성

        int[] arr = new int[10]; // == int arr[] = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 10 + 10;
        }

        // 배열 요소의 값 확인
        // 1) for 문 사용 : 원하는 형태로 출력 가능
        // 2) 향상된 for문 : 1)번과 같음
        // 3) Arrays.toString(배열명) : [배열요소] 형태로 출력됨

        System.out.println(Arrays.toString(arr)); // [10, 20, 30, 40, 50, 60, 70, 80, 90, 100]

        // index 사용 못 함
        int idx = 0;
        for (int i : arr) {
            System.out.print(++idx + "." + i + "\t");

        }

        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            System.out.print((i + 1) + ":" + arr[i] + "\t");

        }

    }

}
