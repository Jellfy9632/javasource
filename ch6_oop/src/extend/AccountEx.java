package extend;

import java.util.Scanner;

public class AccountEx {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // CheckingAccount 의 생성자 호출
        // 부모의 인스턴스도 같이 생성됨
        CheckingAccount cAccount = new CheckingAccount("1", "A", 100, "Card1");

        System.out.println("계좌번호 : " + cAccount.getAno()); // null
        System.out.println("계좌주 : " + cAccount.getOwner()); // null
        System.out.println("잔액 : " + cAccount.getBalance()); // 0
        System.out.println("체크카드번호 : " + cAccount.getCardNo()); // null

        // try {

        // cAccount.pay("1", 10);
        // } catch (Exception e) {
        // e.printStackTrace();
        // }

        // CreditLineAccount

        CreditLineAccount creditLineAccount = new CreditLineAccount("11", "AA", 10000);
        creditLineAccount.creditLine = 10000;
        try {
            creditLineAccount.withdraw(11000);
            System.out.println("현재 잔액 : " + creditLineAccount.getBalance());
        } catch (Exception e) {
            e.printStackTrace();
        }

        // BonusPointAccount

        BonusPointAccount bonusPointAccount = new BonusPointAccount("123", "ABC", 10000, 0);
        bonusPointAccount.deposit(10000);
        System.out.println("보너스 포인트 : " + bonusPointAccount.getBonusPoint());
        System.out.println("잔액 : " + bonusPointAccount.getBalance());
    }

}
