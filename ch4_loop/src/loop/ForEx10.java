package loop;

public class ForEx10 {
    public static void main(String[] args) {

        // for (int i = 1; i <= 5; i++) {

        // for (int j = i; j >= 1; j--) {
        // if (j == i) {
        // for (int k = 4; k >= i; k--) {
        // System.out.print(" ");
        // }
        // }
        // System.out.print("*");
        // }

        // System.out.println();
        // }

        // for (int j = 5; j > 0; j--) {

        // if (j > 1) {
        // System.out.print(" ");
        // } else {
        // System.out.print("*");
        // }

        // }
        // System.out.println();

        // for (int j = 5; j > 0; j--) {

        // if (j > 2) {
        // System.out.print(" ");
        // } else {
        // System.out.print("*");
        // }

        // }

        // System.out.println();

        // for (int j = 5; j > 0; j--) {

        // if (j > 3) {
        // System.out.print(" ");
        // } else {
        // System.out.print("*");
        // }

        // }
        // System.out.println();
        // for (int j = 5; j > 0; j--) {

        // if (j > 4) {
        // System.out.print(" ");
        // } else {
        // System.out.print("*");
        // }

        // }

        // for (int i = 1; i < 6; i++) {
        // for (int j = 5; j > 0; j--) {

        // if (j > i) {
        // System.out.print(" ");
        // } else {
        // System.out.print("*");
        // }

        // }
        // System.out.println();
        // }

        for (int i = 1; i < 6; i++) {
            for (int j = 5; j > 0; j--) {

                // if (j > i) {
                // System.out.print(" ");
                // } else {
                // System.out.print("*");
                // }

                System.out.print(j > i ? " " : "*");

            }
            System.out.println();
        }
    }
}
