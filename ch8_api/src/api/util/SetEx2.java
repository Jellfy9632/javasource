package api.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetEx2 {
    public static void main(String[] args) {
        // 로또번호 1~45
        // 6개 숫자 무작위 추출]

        List<Integer> lotto1 = new ArrayList<>();
        Set<Integer> lotto2 = new HashSet<>();

        for (int i = 0; i < 6; i++) {

            int num = (int) (Math.random() * 45) + 1;
            // lotto1.add(num);
            lotto2.add(num);
        }
        System.out.println();

        // Set => List 변경
        System.out.println(lotto2);
        List<Integer> list = new ArrayList<>(lotto2);
        // list.sort(Comparator.reverseOrder()); // 내림차순

        list.sort(Comparator.naturalOrder());
        System.out.println();
        System.out.println(Comparator.naturalOrder());

    }

}
