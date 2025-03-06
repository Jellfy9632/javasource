package oop;

public class Account {
    // 속성 : 계좌 번호(ano), 예금주명(owner), 잔액(balance)
    // 110-10-0100 long
    // 기능 : 예금하다 (잔액 = 잔액+예금액), 출금하다 (잔액 = 잔액-출금액)
    // deposit,withdraw

    // 생성자(default, 멤버변수 3개 초기화)
    // toString
    private long balance;
    private String ano;
    private String owner;

    public long getBalance() {
        return balance;
    }

    public String getAno() {
        return ano;
    }

    public String getOwner() {
        return owner;
    }

    void deposit(long deposit) {
        this.balance += deposit;
        System.out.printf("%d원 입금완료\n", deposit);

    }

    void withdraw(long withdraw) {

        // 인출액이 잔액보다 작으면 출금
        if (withdraw > balance) {
            return;
        }
        this.balance -= withdraw;
        System.out.printf("%d원 출금완료\n", withdraw);
    }

    public Account() {
    }

    public Account(String ano, String owner, long balance) {
        this.balance = balance;
        this.ano = ano;
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Account [balance=" + balance + ", ano=" + ano + ", owner=" + owner + "]";
    }

}
