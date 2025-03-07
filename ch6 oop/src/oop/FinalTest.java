package oop;

// public final class FinalTest {}

// class Test extends FinalTest {

// }

public class FinalTest {

    final int MAX_SIZE = 10;

    final void getMaxSize() {
        // Max_Size = 20;
        final int LV = MAX_SIZE;
        // LV = 20;
    }

}

class Test extends FinalTest {

}