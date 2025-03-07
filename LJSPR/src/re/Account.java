package re;

public class Account {

    // 속성 : 계좌 번호 (ano), 계좌주 (owner), 잔액 (balance)
    // 기능 : 입금(deposit), 출금(withdraw)
    // 생성자 / toString
    // getter, setter

    private String ano, owner;
    private int balance;

    // 메서드 : 리턴타입 메서드명(){}
    void deposit(long deposit) {
        this.balance += deposit;
        System.out.printf("%d원 입금 완료\n", deposit);
    }

    void withdraw(long withdraw) {
        this.balance -= withdraw;
        System.out.printf("%d원 출금 완료\n", withdraw);
    }

    // getter, setter
    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    // default 생성자
    public Account() {
    }

    // 생성자
    public Account(String ano, String owner, int balance) {
        this.ano = ano;
        this.owner = owner;
        this.balance = balance;
    }

    // 클래스변수 별 toString 소스액션
    @Override
    public String toString() {
        return "Account [ano=" + ano + ", owner=" + owner + ", balance=" + balance + "]";
    }

}
