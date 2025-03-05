package oop;

public class AccountEx1 {
    public static void main(String[] args) {
        // defalut 생성자
        Account account = new Account();
        // 인스턴스 변수 초기화
        account.ano = "123-12-1234";
        account.balance = 1000000;
        account.owner = "홍길동";

        System.out.println(account);

        // 생성자(인스턴스 변수 초기화)
        Account account2 = new Account(2000000, "456-45-4567", "김철수");

        System.out.println(account2);
        System.out.println("현재 잔액 : " + account2.balance);

        // deposit 메서드
        account2.deposit(1500000);

        System.out.println("현재 잔액 : " + account2.balance);

    }

}
