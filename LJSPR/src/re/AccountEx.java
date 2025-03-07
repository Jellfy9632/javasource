package re;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class AccountEx {
    static private Account[] accArr = new Account[100];
    static private Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean run = true;

        while (run) {
            System.out.println("=================================================================");
            System.out.println("1. 계좌생성 | 2. 계좌목록 | 3. 예금하기 | 4. 출금하기 | 5. 종료");
            System.out.println("=================================================================");

            String menu = sc.nextLine();

            switch (menu) {
                case "1":
                    newAccount();
                    break;

                case "2":
                    accountList();
                    break;

                case "3":
                    deposit();
                    break;

                case "4":
                    withdraw();
                    break;

                case "5":
                    System.out.println("종료");
                    run = !run;
                    break;

                default:
                    break;
            }
        }
    }

    static private void newAccount() {

        System.out.print("계좌번호 입력 : ");
        String ano = sc.nextLine();
        System.out.print("계좌주 입력 : ");
        String owner = sc.nextLine();
        System.out.print("잔액 입력 : ");
        int balance = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < accArr.length; i++) {
            if (accArr[i] == null) {
                accArr[i] = new Account(ano, owner, balance);

                break;
            }

        }
        System.out.println("계좌가 생성되었습니다.");

    }

    static private void accountList() {
        System.out.println("-----------------------------------------------------------------");
        System.out.println("계좌 목록");
        System.out.println("-----------------------------------------------------------------");

        for (int i = 0; i < accArr.length; i++) {
            if (accArr[i] != null) {
                System.out.printf("%s\t%s\t%d\n", accArr[i].getAno(), accArr[i].getOwner(), accArr[i].getBalance());
            }

        }
    }

    static private void deposit() {
        System.out.print("입금할 계좌 번호 : ");
        String ano = sc.nextLine();
        Account account = findAccount(ano);

        if (account != null) {
            System.out.print("입금 할 금액 : ");
            int balance = Integer.parseInt(sc.nextLine());
            account.deposit(balance);
        } else {
            System.out.print("계좌 번호가 잘못 되었습니다\n");
        }

    }

    static private void withdraw() {
    }

    static private Account findAccount(String ano) {
        for (int i = 0; i < accArr.length; i++) {
            if (accArr[i] != null && accArr[i].getAno().equals(ano)) {
                return accArr[i];
            }

        }
        return null;

    }

}
