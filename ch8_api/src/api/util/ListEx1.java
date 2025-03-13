package api.util;

import java.util.ArrayList;
import java.util.List;

public class ListEx1 {
    public static void main(String[] args) {
        // int 타입
        List<Integer> list = new ArrayList<>();
        // a arr[0] = 3;
        // 추가
        list.add(15);
        list.add(12);
        list.add(75);
        list.add(16);
        list.add(9);
        list.add(31);
        list.add(3, 25);

        System.out.println(list);

        // 조회
        // arr[3]
        System.out.println("특정 위치 요소 조회 " + list.get(3));
        System.out.println("특정 위치 요소 제거 " + list.remove(0));
        System.out.println("특정 요소 제거 " + list.remove(Integer.valueOf(25)));
        System.out.println(list);
    }

}
