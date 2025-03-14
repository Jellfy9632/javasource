package api.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ListEx6 {
    public static void main(String[] args) {
        // 한 어린이의 키를 2015~2024년 사이에 1년 단위로 입력받기
        // 입력받은 데이터는 ArrayList에 저장한다. 가장 키가 많이 자란 연도 출력
        // 입력 예시 : 120 122 125 130 139 160 169 173 175 175 175

        // int[] years = { 2015, 2016, 2017, 2018, 2019, 2020, 2021, 2022, 2023, 2024 };
        // ArrayList key = new ArrayList<>(10);

        // System.out.println("10년간 키 입력");
        // System.out.println("입력 예시 120 122 125...");
        // Scanner sc = new Scanner(System.in);
        // String heigh = sc.nextLine();
        // key.add(0, heigh.split(heigh));

        Scanner sc = new Scanner(System.in);
        System.out.println("10년 동안의 키를 입력해 주세요");
        System.out.println(">>");
        String input = sc.nextLine();
        StringTokenizer tokenizer = new StringTokenizer(input);

        List<Integer> list = new ArrayList<>();
        while (tokenizer.hasMoreTokens()) {
            list.add(Integer.parseInt(tokenizer.nextToken()));
        }

        // 가장 키가 많이 큰 년도와 cm 출력
        int diff = 0;
        int pos = 0;
        for (int i = 0; i < list.size() - 1; i++) {

            int sub = list.get(i + 1) - list.get(i);
            if (diff < sub) {
                diff = sub;
                pos = i;
            }

        }
        System.out.println("가장 키가 많이 자란 연도 : " + (pos + 2015) + "년, 신장 : " + diff + " cm");
        sc.close();

    }

}
