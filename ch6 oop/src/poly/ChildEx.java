package poly;

public class ChildEx {
    public static void main(String[] args) {

        Child child1 = new Child();
        Parent parent = new Child();

        // child1.method1();
        // child1.method2();
        // child1.method3();

        // parent 접근범위
        // chlid2.field1;

        parent.method1(); // parent method1()
        parent.method2(); // Child method2()

        // The method method3() is undefined for the type Parent
        // parent.method3();

        // method3() 사용
        // 부모 = 자식(O)
        Child child2 = (Child) parent;

        child2.method3();

        // java.lang.ClassCastException: class poly.
        // 자식 = 부모 (x)

        Parent parent2 = new Parent();
        child2 = (Child) parent2;
        child2.method3();

    }

}
