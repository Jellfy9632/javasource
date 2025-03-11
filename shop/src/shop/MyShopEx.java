package shop;

public class MyShopEx {
    public static void main(String[] args) {

        IShop shop = new Myshop();
        // 상정 이름 지정
        shop.setTitle("Myshop");
        // 고객 생성
        shop.genUser();
        // 제품 생성
        shop.genProducts();
        // 상점 시작
        shop.start();
        // 상품 목록
        // shop.productsList();

        // shop.checkout();

    }

}
