package api.object;

public class ObjetEx {
    public static void main(String[] args) {
        Object object1 = new Object();
        Object object2 = new Object();

        // 주소값이 같으냐 ? (같은 인스턴스를 가리키고 있느냐)
        System.out.println(object1.equals(object2) ? "같음" : "다름");
        System.out.println(object1 == object2 ? "같음" : "다름");

        // java.lang.Object@5ca881b5
        System.out.println("Object toString() " + object1.toString());

        Value value1 = new Value(10);
        Value value2 = new Value(10);

        // 부모에게서 상속 시 참조변수의 주소값 비교
        System.out.println(value1.equals(value2) ? "value1 == value2" : "value1 != value2");

        // api.object.Value@3a71f4dd
        System.out.println("Value toString()" + value1.toString());
        // 멤버변수의 값 비교 equals 재정의 : 멤버변수 Value의 값이 같은 값인지 비교

        Person p1 = new Person("hong123", "홍길동");
        Person p2 = new Person("hong123", "홍길동");
        Person p3 = new Person("hong123", "성춘향");

        System.out.println(p1.equals(p2) ? "p1 == p2 " : "p1 != p2");
        System.out.println(p1.equals(p3) ? "p1 == p3 " : "p1 != p3");
        // api.object.Person@85ede7b
        System.out.println("Person toString()" + p1.toString());
    }

}
