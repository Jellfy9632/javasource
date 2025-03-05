package oop;

public class GoodsStockEx1 {
    public static void main(String[] args) {
        // new GoodsStock() : default 생성자를 호출하면서 인스턴스 생성
        // GoodsStock goodsStock = new GoodsStock();
        // goodsStock.code = "p1012";
        // goodsStock.stockNum = 30;

        GoodsStock goodsStock = new GoodsStock("p1012", 50);

        System.out.println(goodsStock);

        goodsStock.stockNumadd(5);

        System.out.println(goodsStock);

        goodsStock.stockNumsubtract(10);
        System.out.println(goodsStock);
    }

}
