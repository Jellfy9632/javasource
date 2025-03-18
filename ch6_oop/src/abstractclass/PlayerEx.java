package abstractclass;

public class PlayerEx {
    public static void main(String[] args) {

        // 인스턴스생성 불가
        // Player player = new Player();
        Player player = new CDPlayer();
        player.play();
        player = new AudioPlayer();
        player.play();
    }

}
