package api.string;

public class StringEx5 {
    public static void main(String[] args) {
        System.out.println("AB 문자열 횟수 : " + count("12345ABC12AB345AB", "AB"));
        System.out.println("AB 문자열 횟수 : " + count("12345", "AB"));
    }

    public static int count(String src, String target) {
        // indexOF

        // int n = 0;
        // for (int i = 0; i < src.length(); i++) {
        // if (src.indexOf(target, i) >= 0) {
        // n++;
        // i = src.indexOf(target, i);
        // }
        // }
        // return n;

        int count = 0, pos = 0;
        while ((pos = src.indexOf(target, pos)) != -1) {
            count++;
            pos += target.length();
        }

        return count;

    }
}
