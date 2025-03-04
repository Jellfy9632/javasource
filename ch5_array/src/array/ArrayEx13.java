package array;

import java.util.Arrays;

public class ArrayEx13 {
    public static void main(String[] args) {
        // 2차원 배열
        // 타입[][] 배열명 = new 타입[3][3];

        // 배열선언 및 생성
        int[][] arr = new int[2][2];

        // 기본값(0)을 원하는 값으로 초기화
        arr[0][0] = 73;
        arr[0][1] = 83;
        arr[1][0] = 63;
        arr[1][1] = 53;

        // 배열출력
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

        // 향상된 for

        for (int[] tmp : arr) {
            for (int is2 : tmp) {
                System.out.print(is2 + "\t");

            }
            System.out.println();

        }

        // 값을 알고 있는 경우
        int arr2[][] = {
                { 100, 100, 100 },
                { 20, 30, 40 }
        };

        // 합계

        int sum = 0;
        for (int[] tmp : arr2) {
            for (int is : tmp) {
                sum += is;
            }

        }
        System.out.println("합계 : " + sum);
    }

}
