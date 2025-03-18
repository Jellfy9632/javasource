package extend;

public class Account {
    // 속성 : 계좌 번호(ano), 예금주명(owner), 잔액(balance)

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

    public void setBalance(long balance) {
        this.balance = balance;
    }

    void deposit(long amount) {
        this.balance += amount;
        System.out.printf("%d원 입금완료\n", amount);

    }

    void withdraw(long amount) throws Exception {

        // 인출액이 잔액보다 작으면 출금
        if (amount > balance) {

            throw new Exception("잔액확인");

        }
        this.balance -= amount;
        System.out.printf("%d원 출금완료\n", amount);

    }

    // public Account() {
    // }

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
