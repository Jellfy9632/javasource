package ch1;

// Byte : 8비트
// 숫자 표현 : 2의 8승 = 256, 음수부터 표현 256/2 => -128 ~ 127 표현 가능

public class VarIntEx1 {
    public static void main(String[] args) {
    // 변수
    // 기본타입 : 정수형, 문자형, 실수형, 불린형
    // 정수형 : byte(1), short(2), int(4), long(8)
    // 문자형 : char(2)
    // 실수형 : float(4), double(8)
    // 불린형 : boolean(1)

    // 변수선언 : 타임 변수명 = 값;
    // 변수명 : 단어 2개가 조합되는 경우 뒷 단어의 시작은 대문자로 한다
    // max-speed : 데이터베이스 필드명
    int age = 15, maxSpeed =100;
    int max = 256;

    //  변수값 변경시 int로 재 선언하지 않고 앞에 선언한 변수명만 가져와 수정한다
    age = 30;

    // System.out.println(age);
    // System.out.println(maxSpeed);

    // + : 산술연산
    // + : 연결(문자)
    System.out.println("나이 : "+age + ", 최고속도 : " + maxSpeed + ", max : "+max);
    System.out.println(age + maxSpeed);

    // 형식화 된 출력(엔터는 안 들어가 있음)
    // %b : boolean, %d : 정수, %f : 실수 %s : 문자열, %c : 문자
    System.out.printf("나이 : %d , 최고속도 : %d, max : %d\n", age,maxSpeed,max);
    System.out.printf("나이 : %10d , 최고속도 : %d, max : %d\n ", age,maxSpeed,max);
 }
    
}