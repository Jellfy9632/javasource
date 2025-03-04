package array;

public class ArrayEx14 {
    public static void main(String[] args) {

        int score[][] = {
                { 100, 78, 68 },
                { 55, 45, 80 },
                { 37, 45, 40 },
                { 89, 78, 65 },
                { 20, 30, 40 },

        };

        System.out.println("번호    국어    영어    수학    총점    평균");
        System.out.println("==============================================");

        int korTotal = 0, engTotal = 0, mathTotal = 0;

        for (int i = 0; i < score.length; i++) {
            System.out.printf("%3d\t", i + 1);

            int sum = 0; // 총점 초기화
            float avg = 0.0f; // 개인별 평균 선언

            for (int j = 0; j < score[i].length; j++) { // {100, 78, 68}

                System.out.printf("%3d\t", score[i][j]);
                sum += score[i][j];
                avg = sum / (float) score[i].length;

            }

            korTotal += score[i][0];
            engTotal += score[i][1];
            mathTotal += score[i][2];

            System.out.printf("%3d\t" + "%5.1f" + "\t", sum, avg);
            System.out.println();

        }
        System.out.println("==============================================");
        System.out.printf("총점\t%3d\t%3d\t%3d\t", korTotal, engTotal, mathTotal);

    }

}
