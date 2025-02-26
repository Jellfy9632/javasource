public class Pr_experi {
    public static void main(String[] args) {
        char ch1 = 'ㄵ';
        int unicode = ch1;
        int nxt_uc = ch1+1;
        char nxt_ucT = (char)nxt_uc;
        char ch3 = '"';
        System.out.println(ch3);

        System.out.printf("%c %c %c의 unicode = %d\n", ch3, ch1, ch3, unicode);
        System.out.printf("next unicode = %d\n", nxt_uc);
        System.out.printf("문자는 = %c\n", nxt_ucT);

        int s = 1;
        char ch2 = (char)s;
        System.out.println(ch2);

    }
    
}
