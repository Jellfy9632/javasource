package stream;

public class Member {

    public static int MALE = 0;
    public static int FEMALE = 1;

    private String name;
    private int gender;
    private int age;

    public Member(String name, int gender, int age) {
        this.gender = gender;
        this.age = age;
        this.name = name;

    }

    public int getAge() {
        return age;
    }

    public int getGender() {
        return gender;
    }

}
