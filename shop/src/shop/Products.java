package shop;

public abstract class Products { // abstract class : 추상 클리스
    // 추상메서드
    private String p_name; // 상품명
    private int price; // 가격

    public Products(String p_name, int price) {
        this.p_name = p_name;
        this.price = price;
    }

    public void printDetail() {
        System.out.println("\t제품명 : " + this.p_name);
        System.out.println("\t가격 : " + this.price);
        printExtra();
    }

    public int getPrice() {
        return price;
    }

    public abstract void printExtra();

    public String getP_name() {
        return p_name;
    }
}
