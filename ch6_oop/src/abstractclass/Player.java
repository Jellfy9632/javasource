package abstractclass;

public abstract class Player {

    boolean pause;
    int currentpos;

    Player() {
        pause = false;
        currentpos = 0;
    }

    // 추상 메서드
    abstract void play();

    void pause() {

    }

}

class CDPlayer extends Player {

    // 추상 클래스, 메서드 활용이 상속받는 자식 클래스에서 추상 메서드에 대한 구체화 필요

    @Override
    void play() {
        System.out.println("CD플레이어");
    }

}

class AudioPlayer extends Player {

    // 추상 클래스, 메서드 활용이 상속받는 자식 클래스에서 추상 메서드에 대한 정의 필요

    @Override
    void play() {
        System.out.println("Audio플레이어");
    }

}