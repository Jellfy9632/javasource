package api.util;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysEx1 {
    public static void main(String[] args) {
        Integer[] arr = { 33, 24, 15, 65, 27 };
        System.out.println(arr);
        System.out.println("배열 값 출력" + Arrays.toString(arr));

        // Arrays.toString(args);
        // Arrays.asList("");

        // Arrays.sort(arr); // 원본을 정렬함

        Arrays.sort((arr), Comparator.reverseOrder());
        System.out.println("정렬 후" + Arrays.toString(arr));

        // 문자 정렬
        Character[] characters = { 'a', 'k', 'b', 't', 'o' };
        Arrays.sort(characters, Comparator.naturalOrder());
        System.out.println(Arrays.toString(characters));
    }

}
