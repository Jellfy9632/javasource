package api.util;

import java.util.Set;
import java.util.TreeSet;

public class SetEx4 {
    public static void main(String[] args) {
        Set<Integer> lotto2 = new TreeSet<>();

        for (int i = 0; i < 6; i++) {

            int num = (int) (Math.random() * 45) + 1;
            // lotto1.add(num);
            lotto2.add(num);
        }

        // hashset : [1, 34, 35, 36, 41, 15]
        System.out.println(lotto2); // [15, 16, 32, 35, 39, 40] 정렬되어있음

    }

}
