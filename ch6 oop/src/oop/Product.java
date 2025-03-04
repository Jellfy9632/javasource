package oop;

import java.time.LocalDate;

public class Product {
    // 속성
    // 제품번호(p10214), 제품명(운동화), 가격(124000), 제조년월(2025-03-04)
    String pCode;
    String pName;
    int price;
    LocalDate regiDate;

    // 기능 - 가격 변경
    // 개발자가 명시하지 않으면 컴파일러가 자동으로 기본생성자를 만들어 줌
    // Product(){}

    void changePrice() {

    }

    @Override
    public String toString() {
        return "Product [pCode=" + pCode + ", pName=" + pName + ", price=" + price + ", regiDate=" + regiDate + "]";
    }

}
