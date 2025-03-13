package api.util;

import java.util.LinkedList;
import java.util.List;

public class ListEx4 {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();

        list.add("딸기");
        list.add("레몬");
        list.add("키위");
        list.add("오렌지");
        list.add("망고");
        list.add("수박");
        list.add("포도");

        for (String string : list) {
            System.out.print(string + "\t");

        }

        System.out.println(list.get(3));
        System.out.println(list.remove(2));
        System.out.println(list.indexOf("수박"));
    }

}
