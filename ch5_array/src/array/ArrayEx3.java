package array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx3 {
    public static void main(String[] args) {

        // 5명 학생의 수학 점수를 입력 받아서 평균, 총합 구하기

        int[] arr = new int[5]; // == int arr[] = new int[10];

        Scanner sc = new Scanner(System.in);

        // System.out.print("첫 번째 학생 점수 입력 >> ");
        // arr[0] = sc.nextInt();

        // System.out.print("두 번째 학생 점수 입력 >> ");
        // arr[1] = sc.nextInt();

        // System.out.print("세 번째 학생 점수 입력 >> ");
        // arr[2] = sc.nextInt();

        // System.out.print("네 번째 학생 점수 입력 >> ");
        // arr[3] = sc.nextInt();

        // System.out.print("다섯 번째 학생 점수 입력 >> ");
        // arr[4] = sc.nextInt();

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
