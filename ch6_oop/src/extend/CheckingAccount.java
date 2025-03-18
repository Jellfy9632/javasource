package extend;

import java.util.Scanner;

public class CheckingAccount extends Account {
    // 은행계좌 + 체크카드
    Scanner sc = new Scanner(System.in);
    private String cardNo;
    public Object pay;

    // 비용 지불
    // 카드 번호와 은행에 등록된 체크카드번호가 일치하는지 여부확인
    // 잔액> 사용액
    // long pay(String cardNo, int amount) {
    // cardNo = sc.nextLine();
    // if (this.cardNo.equals(cardNo)) {
    // System.out.print("사용 할 금액 : ");
    // amount = Integer.parseInt(sc.nextLine());
    // if (this.getBalance() < amount) {
    // withdraw(amount);

    // } else {
    // System.out.println("잔액이 부족합니다");
    // }
    // } else {
    // System.out.println("카드 번호가 일치하지 않습니다");
    // }
    // return getBalance();
    // }

    long pay(String cardNo, int amount) throws Exception {

        if (!this.cardNo.equals(cardNo) || getBalance() < amount) {
            throw new Exception("cardNo나 잔액을 확인해주세요");
        }
        // 비용지불
        withdraw(amount);
        // 잔액 반환
        return getBalance();
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public CheckingAccount(String ano, String owner, long balance, String cardNo) {
        super(ano, owner, balance);
        this.cardNo = cardNo;
    }

    public void pay(int i, int amount) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'pay'");
    }

    // public CheckingAccount() {
    // // 부모의 default 생성자 호출
    // super();
    // }

}
