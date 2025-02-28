package array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx4 {
    public static void main(String[] args) {

        // ?명 학생의 수학 점수를 입력 받아서 평균, 총합 구하기

        int[] arr; // 배열 선언

        System.out.print("학 생 수를 입력하세요: ");

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        // 배열 생성

        arr = new int[num];

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d 번째 학생 점수 입력 >> ", i + 1);
            arr[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(arr));

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {

            sum += arr[i];

        }

        System.out.printf("총합 : %d, 평균 : %.2f ", sum, (double) sum / arr.length);
    }

}
