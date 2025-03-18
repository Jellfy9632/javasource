package inter;

public interface RemoteControl {

    // 상수(final static), 추상메서드(abstract), default, static 메서드
    // 인터페이스에서의 상수는 final static 생략 가능
    int MAX_VOLUME = 10;
    final static int MIN_VOLUME = 0;

    // public abstract 붙이지 않아도 추상 메서드
    void turnON();

    void turnOff();

    void setVolume(int volume);

    default void setMute(boolean mute) {
        if (mute) {
            System.out.println("무음처리합니다.");

        } else {
            System.out.println("무음해제합니다.");
        }
    }

    static void changeBattery() {
        System.out.println("건전지를 교환합니다.");
    }

}
