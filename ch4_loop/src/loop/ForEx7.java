package loop;

// 중첩 for

// *******
// *******
// *******
// *******
// *******

public class ForEx7 {
    public static void main(String[] args) {

        // 별 * 10개 5줄 출력

        // for (int i = 1; i < 11; i++) {
        // System.out.print("*");
        // }
        // System.out.println();

        // for (int i = 1; i < 11; i++) {
        // System.out.print("*");
        // }
        // System.out.println();

        // for (int i = 1; i < 11; i++) {
        // System.out.print("*");
        // }
        // System.out.println();

        // for (int i = 1; i < 11; i++) {
        // System.out.print("*");
        // }
        // System.out.println();

        // for (int i = 1; i < 11; i++) {
        // System.out.print("*");
        // }
        // System.out.println();

        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 9; j++) {

                System.out.print("*");

            }
            System.out.println();

        }

        for (int i = 0; i < 2; i++) {

            for (int j = 0; j < 3; j++) {
                System.out.print(j + "\t");
            }

            System.out.println();

        }
    }

}
