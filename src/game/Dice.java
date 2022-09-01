package game;

import java.util.Random;

public class Dice {
    private final Random random;
    private static final int BOUND = 6;
    private static final int ITER = 1;

    public Dice(long seed) {
        this.random = new Random(seed);
    }

    public Dice() {
        this.random = new Random();
    }

    public int getNumber() {
        return this.random.nextInt(this.BOUND) + this.ITER;
    }
}
