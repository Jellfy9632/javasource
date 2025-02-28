package loop;

// 반복문 - for, while, do-while
// 반복적으로 실행해야 하는 코드를 간단하게 처리

// 안녕하세요 10번 출력

public class ForEx2 {
    public static void main(String[] args) {

        // 반복문 중단 강제 중단 (break) or 조건이 false
        // 1) int i = 0; 변수선언
        // 2) i<5; 조건검사
        // 3) 루프 안으로 진입 - 안녕하세요 출력
        // 4) 증간연산자 실행 i++ (i=1)
        // 5) 조건검사
        // 6) 루프안으로 진입 안녕하세요 출력
        // 7) 증감연산자 실행 i++ (i=2)
        // 8) 5~7반복
        // ...증감연산자 실챙 i++ (i=5)
        // 조건검사 5<6 루프중단

        // 1~10 출력하기

        for (int i = 1; i < 11; i++) {
            System.out.print(i + "   ");
        }
        System.out.println();

        // 10~1 출력하기

        for (int i = 10; i > 0; i--) {
            System.out.print(i + "   ");
        }
        System.out.println();

        // 짝수만 출력 1~10
        for (int i = 1; i < 11; i++) {
            if (i % 2 == 0) {
                System.out.print(i + "   ");
            }

        }
        System.out.println();

        // i += 2; : i = i + 2;
        for (int i = 2; i < 11; i += 2) {
            System.out.print(i + "   ");
        }

        // for 구문 사용시 정수선언은 조건 바깥에서도 가능하고 조건에서 첫 번째는 ;만 남겨 생략
        // 조건에서 정수선언은 여러개 가능
        // 조건에서 논리 연산이 가능
        int i = 0;
        for (int j = 0, k = 0; i < 0; i++) {
        }

        // 조건도 전부 생략이 가능함

        // for(;;){

        // }
    }

}
