package oop;

public class Student {
    // 멤버 변수, 멤버 메소드, 생성자,

    // 속성 : 학번(s1024125), 이름(홍길동), 학년(1), 반(1), 전화번호(010-1234-1234),
    // 이메일(hong@gmail.com)

    String stuId;
    String name;
    int grade;
    int classnum;
    String phone;
    String email;

    // 생성자 : 개발자가 명시하지 않으면 컴파일러가 자동으로 default 생성자 만들어 줌
    // 클래스명(){}

    // 기본 생성자
    public Student() {
    }

    // 생성자의 목적
    // 멤버 변수 초기화
    public Student(String stuId, String name, int grade, int classnum, String phone, String email) {
        this.stuId = stuId;
        this.name = name;
        this.grade = grade;
        this.classnum = classnum;
        this.phone = phone;
        this.email = email;
    }

    // int grade, int classnum - 지역변수 (전달인자)
    public Student(int grade, int classnum) {
        this.grade = grade;
        this.classnum = classnum;
    }

    // 기능 : 전화번호 변경, 이메일 변경. 학년 변경, 반 변경
    // 메소드 : 리턴타입 메소드명(){}
    void changeTel() {

    }

    void changeEmail() {

    }

    void changeClassNum() {

    }

    @Override
    public String toString() {
        return "Student [stuId=" + stuId + ", name=" + name + ", grade=" + grade + ", classnum=" + classnum + ", phone="
                + phone + ", email=" + email + "]";
    }

}