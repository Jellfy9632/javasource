package generics;

class FruitBox<T extends Fruit> extends Box3<T> {

    // FruitBox 담을 수 있는 타입 : Fruit와 Fruit의 자손들만 허용
}

public class Juice {
    String name;

    Juice(String name) {
        this.name = name;
    }

    @Override
    public String toString() {

        return name;
    }
}

class Juicer {
    static Juice makeJuice(FruitBox<? extends Fruit> box) {
        String tmp = "";
        for (Fruit f : box.getList()) {
            tmp += f + " ";
        }
        return new Juice((tmp));
    }
}
