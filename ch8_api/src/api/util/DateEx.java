package api.util;

import java.util.Date;
import java.text.SimpleDateFormat;

public class DateEx {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d); // ThU mae 12 12:02:55 KST 2025

        // yyyy : 년도 4

        // a : Am/Pm

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");

        System.out.println(sdf.format(d));

        sdf = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss a");

        System.out.println(sdf.format(d));

        sdf = new SimpleDateFormat("오늘은 E 요일");
        System.out.println(sdf.format(d));
    }

}
