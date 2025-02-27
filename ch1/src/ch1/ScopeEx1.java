package ch1;

// 변수의 유효 범위
// {}안에서 선언된 변수는 {} 벗어난 곳에서는 사용 불가
public class ScopeEx1 {
    public static void main(String[] args) {
        {
            int a = 100;

            {
                int x = 10;
                System.out.println("x=" + x);
                System.out.println("a=" + a);
            }
            // x cannot be resolved to a varriable
            // System.out.println("x="+x);
            System.out.println("a=" + a);
            
            int u =12;

            if (a < 200) {
                int sum = 0;
            }

            for (u = 0; u < 15; u++) {
                
            }
        }
    }

}
