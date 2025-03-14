package api.util;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import api.object.Person;

public class SetEx3 {
    public static void main(String[] args) {
        // Person 객체 리스트로
        Set<Person> set = new HashSet<>();
        set.add(new Person("A1", "고죠 사토루"));
        set.add(new Person("B2", "료멘스쿠나"));
        set.add(new Person("C3", "옷코츠 유우타"));
        set.add(new Person("D4", "이타도리 유지"));
        set.add(new Person("B2", "료멘스쿠나"));
        set.add(new Person("E5", "게토 스구루"));

        for (Person person : set) {
            System.out.println(person); // person.toString()

        }
        // 아이디 이름
        // ------------------
        // A1 고죠 사토루

        System.out.println("아이디\t이름");
        System.out.println("============================");
        for (Person person : set) {
            System.out.printf("%s\t%s\n", person.getId(), person.getName());

        }
        System.out.println(new Person("hon12", "홍길동").hashCode());
        System.out.println(new Person("hon12", "홍길동").hashCode());
    }

}
