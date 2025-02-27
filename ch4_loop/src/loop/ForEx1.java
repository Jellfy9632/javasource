package loop;

// 반복문 - for, while, do-while
// 반복적으로 실행해야 하는 코드를 간단하게 처리

// 안녕하세요 10번 출력

public class ForEx1 {
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
        //    조건검사 5<6 루프중단


        for (int i = 0; i < 5; i++) {
            System.out.println("안녕하세요");
            
            
        }
    }
    
}
