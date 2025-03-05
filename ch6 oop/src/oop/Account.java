package oop;

public class Account {
    // 속성 : 계좌 번호(ano), 예금주명(owner), 잔액(balance)
    // 110-10-0100 long
    // 기능 : 예금하다 (잔액 = 잔액+예금액), 출금하다 (잔액 = 잔액-출금액)
    // deposit,withdraw

    // 생성자(default, 멤버변수 3개 초기화)
    // toString

    long balance;
    String ano, owner;

    void deposit(long deposit) {
        this.balance += deposit;
        System.out.printf("입금액 %d\n", deposit);

    }

    void withdraw(long withdraw) {

        this.balance -= withdraw;
        System.out.printf("출금액 %d\n", withdraw);
    }

    public Account() {
    }

    public Account(long balance, String ano, String owner) {
        this.balance = balance;
        this.ano = ano;
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Account [balance=" + balance + ", ano=" + ano + ", owner=" + owner + "]";
    }

}
