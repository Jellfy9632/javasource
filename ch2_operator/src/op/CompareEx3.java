package op;

public class CompareEx3 {
    public static void main(String[] args) {
        // 문자열 : "a", "abcd"
        // 문자열은 기본타입으로 선언하지 안는다. 겍체타입으로 선언
        // 타입의 시작 문자를 대문자로 시작

        String str1 = "abc";
        String str2 = "abc";
        String str3 = new String("abc");

        // str1(str2) 을 저장하는 공간과 str3 을 저장하는 공간이 다름
        // 같은 공간에서 저장된 같은 문자열 비교시 ==를 사용 (값 비교) 하면 true
        // 다른 공간에서 저장된 같은 문자열 비교시 ==를 사용 (주소 비교) 하면 false

        System.out.printf("str1 == str2 = %b\n", (str1 == str2));
        System.out.printf("str1 == str3 = %b\n", (str1 == str3));
        // 문자열 비교 == 대신에 equals(), equalsIgnoreCase() 사용
        // abc == ABC : false
        System.out.printf("str1 == str3 = %b\n", (str1.equals(str3))); // true
        System.out.printf("str1 == str3 = %b\n", (str1.equals("ABC"))); // false

        // equalsCase : 대소문자를 구분하지 않고 비교
        System.out.printf("str1 == str3 = %b\n", (str1.equalsIgnoreCase(str3))); // true
        System.out.printf("str1 == str3 = %b\n", (str1.equalsIgnoreCase("ABC"))); // true
    }
    
}
