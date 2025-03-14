package api.util;

import java.util.HashSet;
import java.util.Set;

public class SetEx1 {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();

        set1.add("딸기");
        set1.add("레몬");
        set1.add("키위");
        set1.add("오렌지");
        set1.add("망고");
        set1.add("레몬");
        set1.add("포도");

        System.out.println(set1);

        String str1 = "사과";
        String str2 = "사과";
        String str3 = new String("사과");

        System.out.println("str1.hashCode() " + str1.hashCode());
        System.out.println("str2.hashCode() " + str2.hashCode());
        System.out.println("str3.hashCode() " + str3.hashCode());

    }

}
