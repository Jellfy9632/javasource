package exception;

public class ArrayEx {
    public static void main(String[] args) {
        int arr[] = new int[2];

        // ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 2
        // try {

        // System.out.println(arr[0]);
        // int num = 100 / 0; // ArithmeticException

        // } catch (ArrayIndexOutOfBoundsException e) {
        // // e.printStackTrace();
        // System.out.println("배열 인덱스를 확인해 주세요");
        // } catch (ArithmeticException e) {
        // System.out.println("0으로 나눌 수 없습니다.");
        // }

        // try {

        // System.out.println(arr[0]);
        // int num = 100 / 0; // ArithmeticException

        // } catch (Exception e) {
        // // 매개변수의 다형성 개념을 활용해 Exception을 한번에 다룰 수 있다

        // System.out.println("오류 발생");
        // }

        try {

            System.out.println(arr[0]);
            int num = 100 / 0; // ArithmeticException

        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
            // Multi catch 블럭 매개변수로 들어가는 Exception을 | 기호로 이어서 처리

            System.out.println("오류 발생");
        }
    }

}
