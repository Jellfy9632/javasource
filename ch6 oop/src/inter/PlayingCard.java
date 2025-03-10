package inter;

public interface PlayingCard {

    // 멤버 변수 가질 수 없음
    // The blank final field pause may not have been initialized
    // boolean pause;

    // 인터페이스에 포함되는 요소들
    // 상수 (대문자로 선언)
    public static final int SPADE = 4;
    // 인터페이스에서는 public static final 생략 가능
    int CLOVER = 4;

    // 일반 메서드 가질 수 없음
    // Abstract methods do not specify a body
    // void pause(){}

    // 인터페이스 에서 추상 메서드 앞의 public abstract는 생략 가능
    void pause();

    // 앞에 static 또는 default가 붙는다면 일반 메소드도 허용
    static void display() {
    }

    default void print() {
    }
}
