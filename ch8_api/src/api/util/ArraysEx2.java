package api.util;

import java.util.Arrays;

public class ArraysEx2 {
    public static void main(String[] args) {

        String string;
        Integer[] arr = { 33, 24, 15, 65, 27, 11, 1, 10 };

        // 배열 안에 15 가 들어있는가?

        Arrays.sort(arr);
        System.out.println("15 위치 " + (Arrays.binarySearch(arr, 15) + 1) + " 번 째");

        // 배열 비교

        Integer[] arr1 = { 33, 24, 15, 65, 7, };
        Integer[] arr2 = { 33, 24, 15, 65, 7, };
        System.out.println("배열요소 비교 : " + Arrays.equals(arr1, arr2));

    }

}
