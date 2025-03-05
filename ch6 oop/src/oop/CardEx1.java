package oop;

public class CardEx1 {
    public static void main(String[] args) {

        // static 으로 선언된 변수와 메서드는 클래스이름.변수/메서드 형태로 접근

        System.out.println("카드너비 " + Card.width);
        System.out.println("카드높이 " + Card.height);

        Card card1 = new Card();

        card1.kind = "Heart";
        card1.number = 7;
        // card1.height = 200;

        Card card2 = new Card();

        card1.kind = "Spade";
        card1.number = 7;

    }

}
