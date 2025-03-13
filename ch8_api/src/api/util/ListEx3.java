package api.util;

import java.util.ArrayList;
import java.util.List;

import api.object.Person;

public class ListEx3 {
    public static void main(String[] args) {
        // Person 객체 리스트로
        List<Person> list = new ArrayList<>();
        list.add(new Person("A1", "고죠 사토루"));
        list.add(new Person("B2", "료멘스쿠나"));
        list.add(new Person("C3", "옷코츠 유우타"));
        list.add(new Person("D4", "이타도리 유지"));
        list.add(new Person("E5", "게토 스구루"));

        for (Person person : list) {
            System.out.println(person); // person.toString()

        }
        // 아이디 이름
        // ------------------
        // A1 고죠 사토루

        System.out.println("아이디\t이름");
        System.out.println("============================");
        for (Person person : list) {
            System.out.printf("%s\t%s\n", person.getId(), person.getName());

        }
    }

}
