package shop;

import java.util.Scanner;

public class Myshop2 implements IShop {

    private String title;
    Scanner sc = new Scanner(System.in);

    // 고객 5명 저장 가능한 배열 생성

    private User[] users = new User[5];

    // 제품 10개 저장 가능한 배열 생성
    Products[] products = new Products[10];
    // cart (제품 저장 가능한 배열)
    Products[] cart = new Products[10];

    // start() 에서 선택된 user 보관 변수;
    private String sellUser;

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public void genUser() {
        // 2 명의 User 생성 후 배열객체에 담기
        users[0] = new User("깁갑룡", PayType.CARD);
        users[1] = new User("김기명", PayType.CASH);
    }

    @Override
    public void genProducts() {

        // 5개 제품 생성 후 배열객체에 담기 (tv2개, cellphone 3개
        products[0] = new Tv("삼성 QLED", 5000000, "4K");
        products[1] = new Tv("LG 울트라 HD", 4800000, "4K");
        products[2] = new CellPhone("아이폰", 1200000, "LG U+");
        products[3] = new CellPhone("갤럭시S8+", 1120000, "kt");
        products[4] = new CellPhone("베가아이언", 1200000, "SKT");

    }

    @Override
    public void start() {
        System.out.printf("%s : 메인화면 - 계정선택\n", title);
        System.out.println("================================");
        for (int i = 0; i < products.length; i++) {
            if (users[i] != null) {
                System.out.printf("[%d]\t%s\t%s\n", i, users[i].getName(), users[i].getPayType());
            } else {
                break;
            }
        }
        System.out.println("[X]\t종료");
        System.out.println("================================");
        System.out.print("선택 : ");

        String input = sc.nextLine();

        if (input.equalsIgnoreCase("x")) {
            System.out.println("종료합니다.");
            System.exit(0);
        } else {

            switch (input) {
                case "0", "1":
                    sellUser = input;
                    productsList();
                    break;

                default:
                    System.out.println("잘 못 된 입력");
                    start();
                    break;
            }
        }

    }

    public void productsList() {
        System.out.printf("%s : 상품목록 - 상품선택\n", title);
        System.out.println("================================");
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null) {
                System.out.printf("[%d] ", i);
                products[i].printDetail();
                System.out.println("-------------------------------");
                System.out.println();
            } else {
                break;
            }
        }
        System.out.println("[h]\t메인화면");
        System.out.println("[c]\t체크아웃");
        System.out.println("================================");
        System.out.print("선택 : ");
        // 0~4 or h or c
        String input = sc.nextLine();
        switch (input) {
            case "h":
            case "H":
                start();
                break;
            case "c":
            case "C":

                checkout();
                break;
            case "0":
            case "1":
            case "2":
            case "3":
            case "4":

                for (int i = 0; i < cart.length; i++) {
                    if (cart[i] == null) {
                        cart[i] = products[Integer.parseInt(input)];
                        break;

                    }

                }
                productsList();
                break;

            default:
                break;
        }

    }

    public void checkout() {
        System.out.printf("%s : " + users[Integer.parseInt(sellUser)].getName() + " - 체크아웃\n", title);
        System.out.println("================================");
        int i = 0, sum = 0;
        for (Products products : cart) {
            if (products != null) {
                System.out.printf("[%d] %s (%d)\n", i++, products.getP_name(), products.getPrice());
                sum += products.getPrice();

            }

        }
        System.out.println("결제방법 : " + users[Integer.parseInt(sellUser)].getPayType());
        System.out.printf("합계 : %d 원\n", sum);
        System.out.println("================================");
        System.out.println("[p]\t이전");
        System.out.println("[q]\t종료");
        System.out.print("선택 : ");
        String input = sc.nextLine();
        if (input.equalsIgnoreCase("p"))
            productsList();

    }

}
