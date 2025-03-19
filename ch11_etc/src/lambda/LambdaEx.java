package lambda;

public class LambdaEx {
    public static void main(String[] args) {

        // Lambda2를 사용
        // 1) 구현 클래스 작성 : class LambdaImp1 implements Lamda2{}
        // 2 익명 구현객체

        Lambda2 obj = new Lambda2() {

            @Override
            public void method() {

            }
        };

        // 3) 람다식으로 사용
        Lambda2 obj2 = () -> System.out.println("함수적 인터페이스 사용");
        obj2.method();

        obj2 = () -> {
            int i = 100;

            System.out.println(i + 1);
        };
        obj2.method();

        Lambda3 lambda3 = (a, b) -> a > b ? a : b;
        System.out.println("max 값" + lambda3.max(5, 3));
    }

}
