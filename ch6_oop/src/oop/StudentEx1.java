package oop;

public class StudentEx1 {
    public static void main(String[] args) {
        // Student 인스턴스 생성, 사용
        // 인스턴스 생성시 생성자 사용함
        Student student1 = new Student();
        Student student2 = new Student(1, 5);
        Student student3 = new Student("s1234567", "홍길동", 1, 5, "010-1234-1234", "hong@gmail.com");
        Student student4 = new Student("s1234587", "홍길순", 1, 5, "010-1234-1234", "hong@gmail.com");

        // 개발자 확인용
        // System.out.println(student1);
        // System.out.println(student2);
        // System.out.println(student3);

        studentInfo(student3);
        // System.out.println("=======================");
        // System.out.println("아이디 : " + student3.getStuId());
        // System.out.println("이름 : " + student3.getName());
        // System.out.println("학년 : " + student3.getGrade());
        // System.out.println("학년 : " + student3.getClassnum());
        // System.out.println("전화번호 : " + student3.getPhone());
        // System.out.println("이메일 : " + student3.getEmail());
        // System.out.println("=======================");

        System.out.println();

        studentInfo(student4);
        // System.out.println("=======================");
        // System.out.println("아이디 : " + student4.getStuId());
        // System.out.println("이름 : " + student4.getName());
        // System.out.println("학년 : " + student4.getGrade());
        // System.out.println("학년 : " + student4.getClassnum());
        // System.out.println("전화번호 : " + student4.getPhone());
        // System.out.println("이메일 : " + student4.getEmail());
        // System.out.println("=======================");

        // 홍길동 전화번호 변경

        student3.changeTel("010-1234-5678");
        System.out.println(student3);

    }

    public static void studentInfo(Student student) {

        System.out.println("=======================");
        System.out.println("아이디 : " + student.getStuId());
        System.out.println("이름 : " + student.getName());
        System.out.println("학년 : " + student.getGrade());
        System.out.println("학년 : " + student.getClassnum());
        System.out.println("전화번호 : " + student.getPhone());
        System.out.println("이메일 : " + student.getEmail());
        System.out.println("=======================");

    }
}