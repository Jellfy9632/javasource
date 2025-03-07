package oop;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import static java.lang.Math.*;

// imprt 사용하지않는 패키지 (자동으로 import 할때 해줌)
// java.lang.* (lang에 속한 모든 클래스)

// import 문
// 다른 패키지의 클래스를 사용할 때 

public class ImportEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Parent parent = new Parent();

        Date date = new Date();
        System.out.println(date); // Fri Mar 07 16:40:58 KST 2025
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("오늘 날짜는 : " + simpleDateFormat.format(date));

        // Mathe : static 메소드로 선언됨
        System.out.println(Math.min(15, 3));
        System.out.println(random());
        String str;

    }

}
