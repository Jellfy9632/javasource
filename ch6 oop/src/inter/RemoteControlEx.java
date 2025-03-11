package inter;

public class RemoteControlEx {
    public static void main(String[] args) {
        RemoteControl rc;

        rc = new Television();
        rc.turnON();
        rc.setVolume(8);
        rc.setMute(true);
        rc.turnOff();

        RemoteControl.changeBattery();

        rc = new Audio();
        rc.turnON();
        rc.setVolume(8);
        rc.turnOff();

        // 익명 구현 클래스
        rc = new RemoteControl() {

            private int volume;

            @Override
            public void turnON() {
                System.out.println("라디오를 켭니다.");
            }

            @Override
            public void turnOff() {

                System.out.println("라디오를 끕니다.");
            }

            @Override
            public void setVolume(int volume) {

                if (volume > RemoteControl.MAX_VOLUME) {
                    this.setVolume(RemoteControl.MAX_VOLUME);
                } else if (volume < RemoteControl.MIN_VOLUME) {
                    this.setVolume(RemoteControl.MIN_VOLUME);
                } else {
                    this.volume = volume;
                }
                System.out.println("현재 라디오 볼륨 : " + this.volume);
            }

        };
        rc.turnON();
        rc.turnOff();

    }

}
