package condition;

public class IfTest5 {
    public static void main(String[] args) {
        // 주사위 1~6

        // 0.3510788136103127
        // 0.548990484031378
        // Math.random() 실행 할 때마다 랜덤한 값이 나오는 메소드
        // 0.0 <= Math.random() < 1.0

        // ((Math.random() * 6) : 0~5 ) + 1
        
        int num = (int)((Math.random() * 6) + 1);

        // num 이 1이면 주사위 1번이 나왔습니다. 1~6 작업

        // System.out.printf("주사위 %d번이 나왔습니다.\n", num);

        if (num>=6){
            System.out.println("주사위 6번이 나왔습니다.");
        }

        else if (num>=5){
            System.out.println("주사위 5번이 나왔습니다.");
        }
        else if (num>=4){
            System.out.println("주사위 4번이 나왔습니다.");
        }
        else if (num>=3){
            System.out.println("주사위 3번이 나왔습니다.");
        }
        else if (num>=2){
            System.out.println("주사위 2번이 나왔습니다.");
        }
        else{
            System.out.println("주사위 1번이 나왔습니다.");
        }
    }
    
}
