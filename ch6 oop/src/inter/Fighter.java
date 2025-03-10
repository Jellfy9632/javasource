package inter;

import java.util.Scanner;

public class Fighter extends Unit implements Fightable {

    String msg;
    Scanner sc;

    @Override
    public void move(int x, int y) {

        Math.random();
        throw new UnsupportedOperationException("Unimplemented method 'move'");
    }

    @Override
    public void attack(Unit unit) {
        throw new UnsupportedOperationException("Unimplemented method 'attack'");
    }

}
