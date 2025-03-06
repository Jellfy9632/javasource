package oop;

public class TvEx {
    public static void main(String[] args) {
        Tv tv = new Tv();
        tv.size = 50;
        tv.color = "black";

        Tv2 tv2 = new Tv2(65, "blue");

        // tv 켜기
        tv2.power(); // power = !power;

        // 채널 변경
        tv2.changechannel(7);

        // 볼륨 변겨어어어어어어어어엉

        Tv2 tv3 = new Tv2();

        tv3.power();
        tv3.changechannel(11);

        Tv3 obj1 = new Tv3();

        System.out.println("처음상태");
        System.out.println(obj1.toString());

        obj1.setSize(60);
        obj1.setColor("Yellow Green");
        System.out.println("색상 : " + obj1.getColor());
        System.out.println("사이즈 : " + obj1.getSize());

    }

}
