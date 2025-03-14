package api.util;

import java.util.TreeSet;

public class SetEx5 {
    public static void main(String[] args) {

        TreeSet<String> set = new TreeSet<>();

        String from = "b", to = "d";

        set.add("abc");
        set.add("aline");
        set.add("bat");
        set.add("Car");
        set.add("cat");
        set.add("dise");
        set.add("dansce");
        set.add("dzzzzz");
        set.add("dzzzzz");
        set.add("elephant");
        set.add("elevator");
        set.add("abc");
        System.out.println(set);
        System.out.println(set.subSet(from, to));
        System.out.println(set.subSet(from, to + "zzz"));
    }

}
