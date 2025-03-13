package api.string;

public class WrapperEx1 {
    public static void main(String[] args) {
        Integer i = 10;
        int j = 10;

        System.out.println("String 숫자 => int로 변환 " + Integer.parseInt("10"));
        System.out.println("int => String 숫자" + i.toString(10));
        System.out.println("(5,8) max" + Integer.max(5, 8));
        System.out.println("(5,8) min" + Integer.min(5, 8));

        // int ==> Integer
        // Integer ==> int
    }
}
