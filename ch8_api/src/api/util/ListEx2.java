package api.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListEx2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        // 요소 추가
        list.add("딸기");
        list.add("레몬");
        list.add("키위");
        list.add("오렌지");
        list.add("망고");
        list.add("수박");
        list.add("포도");

        // 제거

        System.out.println("index 를 이용한 제거 " + list.remove(5));
        System.out.println("아이템 제거 " + list.remove("키위"));

        // 배열 : length , 리스트 : size()

        for (int i = 0; i < list.size(); i++) {
            System.out.printf("%s\t", list.get(i));
        }

        System.out.println();

        for (String string : list) {
            System.out.printf("%s\t", string);

        }
        System.out.println();

        System.out.println("리스트에 특정 단어 포함 여부" + list.contains("레몬"));
        System.out.println("리스트에 특정 단어 포함 여부" + list.indexOf("레몬"));

        // int[] arr = {}
        // 배열 => 리스트 변환
        // Arrays : 배열에 필요한 유용한 메소드 제공
        String strArr[] = { "사과", "포도", "멜론", "수박", "참외", "바나나", "자두" };
        List<String> list2 = Arrays.asList(strArr);

        System.out.println("조회" + list2.get(3));
        // UnsupportedOperationException :변경
        // System.out.println("삭제" + list2.remove(3));
        // list2.add("딸기");

        // 배열 => 리스트 변환 (조회+변경)

        List<String> list3 = new ArrayList<>(Arrays.asList(strArr));
        list3.add("딸기");
        list3.remove(3);
        System.out.println(list3);

        // 리스트 => 배열

        Object[] arrs = list3.toArray();

        System.out.println(Arrays.toString(arrs));

    }

}
