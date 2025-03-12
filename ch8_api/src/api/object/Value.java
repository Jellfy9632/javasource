package api.object;

public class Value {
    int value;

    public Value(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {

        Value v = (Value) obj;

        return this.value == v.value;
    }

    @Override
    public String toString() {

        return "Value [value= " + value + "]";
    }

    // toString() 을 멤버변수 값 출력 용도로 오버라이드
    // @Override
    // public String toString() {

    // return value + "";
    // }

}
