package oop;

// private : 외부 클래스에서 접근 불가

public class Tv2 {
    private int size, channel, volume;
    private String color;
    private boolean power;

    // 초기화 - 생성자

    public Tv2() {

    }

    void channelup() {
        channel++;
    }

    public Tv2(int size, String color) {
        this.size = size;
        this.color = color;
    }

    void changechannel(int channel) {
        this.channel = channel;

    }

    void channeldown() {
        channel--;
    }

    void power() {
        power = !power;
    }

    @Override
    public String toString() {
        return "Tv [size=" + size + ", channel=" + channel + ", volume=" + volume + ", color=" + color + ", power="
                + power + "]";
    }

}
