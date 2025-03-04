package array;

import java.util.Scanner;

public class pr_experi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("몇 개의 줄을 만들까요? >> ");
        int line = sc.nextInt();

        for (int i = line; i > 0; i--) {
            for (int j = line; j > 0; j--) {
                if (j > i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }

            }
            System.out.println();
        }

        for (int k = 0; k < line + 1; k++) {
            for (int l = line; l > 0; l--) {
                if (l > k) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }

            }
            System.out.println();
        }

    }

}
