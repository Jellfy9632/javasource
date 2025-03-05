package oop;

public class GoodsStock {
    // 속성 : code(상품코드), stockNum(재고수량)
    String code;
    int stockNum;

    // 생성자
    // default 생성자 - 선택사항
    // public GoodsStock() {
    // }

    public GoodsStock(String code, int stockNum) {
        this.code = code;
        this.stockNum = stockNum;
    }

    // 기능 : 재고 추가한다, 재고 감소한다
    void stockNumadd(int sta) {
        this.stockNum += sta;
    }

    // 판매
    void stockNumsubtract(int sell) {
        this.stockNum -= sell;
    }

    @Override
    public String toString() {
        return "GoodsStock [code=" + code + ", stockNum=" + stockNum + "]";
    }

}
