package extend;

public class SubStringEx {
    public static void main(String[] args) {
        SubString obj = new SubString();

        // 상속한 클래스와 상속받은 클래스에서
        // 변수, 메서드명이 동일하게 선언 된 경우
        // 상속받은 클래스의 것을 우선하여 처리
        System.out.println(obj.name);
        obj.list(); // 성춘향 하위 클래스 이름 출력을 위하는 경우
    }

}
