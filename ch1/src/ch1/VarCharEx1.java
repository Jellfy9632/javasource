package ch1;

public class VarCharEx1 {
    public static void main(String[] args) {
        // 문자 : 글자 한개 => 'a','미',' '
        // 문자열 : 글자 한개~여러개 => "미","a","abc","대한민국"," "

        // 기라는 문자를 ch1 에 대입
        char ch1 = '기';

        // ch1의 값을 unicode 변수에 대입
        // int = char
        int unicode = ch1;
        System.out.println("ch1 = "+ch1);
        System.out.println("unicode = "+unicode); //'기' 문자의 unicode 값 44592

        char ch2 = 'a';
        unicode = ch2;        
        System.out.println("ch2 = "+ch2);
        System.out.println("unicode = "+unicode); // 소문자 a의 유니코드는 97 *암기

        char ch3 = 'A';
        unicode = ch3;
        System.out.println("ch3 = "+ch3);
        System.out.printf("ch3 = %c\n ", ch3);
        System.out.println("unicode = "+unicode); // 대문자 A의 유니코드는 65 *암기

    }
    
}
