package inter;

interface I {
    void methodB();
}

class AA {
    public void methodA(I i) { // 매개변수를 인터페이스로 처리
        i.methodB();
    }
}

class BB implements I {
    @Override
    public void methodB() {
        System.out.println("method B()");

    }

}

public class InterfaceTest2 {
    public static void main(String[] args) {
        AA obj1 = new AA();
        obj1.methodA(new BB());
    }

}
