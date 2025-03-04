package oop;

public class StudentEx1 {
    public static void main(String[] args) {
        // Student 인스턴스 생성, 사용
        // 인스턴스 생성시 생성자 사용함
        Student student1 = new Student();
        Student student2 = new Student(1, 5);
        Student student3 = new Student("s1234567", "홍길동", 1, 5, "010-1234-1234", "hong@gmail.com");

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);

        // when i 16years old broke my leg i was running from brother and his friend
        // it tasted sweet perfume on the mountain grass as i roll down
        // i was younger than take me back to when i
        // found my heart make them friends and lost them through the years
        // i've not seen the roaring field in so long oh how we've grown
    }

}
