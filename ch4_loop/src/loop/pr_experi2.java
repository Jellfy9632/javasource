package loop;

public class pr_experi2 {
    public static void main(String[] args) {

        int ln = 1, count, star, blank, ui = 5;

        // 한 줄의 카운트가 끝날때까지 반복할 것
        if (ui > 0) {

            count = ui;

            while (count > 0) {

                // 만약 카운트가 끝나지 않았다면 == 줄이 바뀌지 않았다면
                if (count > 0) {

                    blank = ln - 1; // blank 갯수 설정 == 줄 번호 -1개
                    star = ui - blank; // star 갯수 설정 == 유저 입력값 - (줄 번호 -1 == 남은 블랭크 갯수)

                    while (blank > 0) { // 블랭크 갯수가 남았다면
                        System.out.print(" "); // 블랭크를 출력한 다음
                        blank--; // 남은 블랭크의 갯수를 줄인다
                    }
                    while (star > 0) { // 별 갯수가 남았다면
                        System.out.print("★"); // 별을 출력한 다음
                        star--; // 남은 별의 갯수를 줄인다
                    }

                    count--;
                }
                // 카운트가 끝났다면 == 줄이 바뀌었다면
                System.out.println(); // 한 줄 띄우기
                ln++; // 줄 번호 바꾸기 (더하기)

            }

        }

    }
}
