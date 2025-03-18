package extend;

public class CheckingTrafficAccount extends CheckingAccount {

    private boolean hasTrafficCard;

    public CheckingTrafficAccount(String ano, String owner, long balance, String cardNo, boolean hasTrafficCard) {
        super(ano, owner, balance, cardNo);
        this.hasTrafficCard = hasTrafficCard;
    }

    public boolean isHasTrafficCard() {
        return hasTrafficCard;

    }

    // 교통비 지불

    long payTrafficCard(String cardNo, int ammount) throws Exception {

        // 교통카드 기능이 있다면 교통비 지불
        if (hasTrafficCard != true) {

            throw new Exception("교통카드 기능이 없습니다.");

        }
        // 카드번호, 잔액 확인 후 지불

        return pay(cardNo, ammount);
    }

}
