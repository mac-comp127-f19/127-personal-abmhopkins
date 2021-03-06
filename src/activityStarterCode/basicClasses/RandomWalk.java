package activityStarterCode.basicClasses;

import java.util.Random;

/**
 * Represents a random walk along the integer
 * number line starting at some value. At each step it either moves
 * forward or backward by one unit.
 */
public class RandomWalk {
    private Random rng;
    private int currentValue;
    private int min;
    private int max;

    /**
     * Creates a new random walk starting with some initial value.
     *
     */
    public RandomWalk(int startingValue, int minimum, int maximum) {
        currentValue = startingValue;
        min = minimum;
        max = maximum;
        rng = new Random();
    }

    /**
     *
     * @return the current value for the random walk.
     */
    public int getValue() {
        return currentValue;
    }

    /**
     * Updates the value randomly by adding either +1 or -1.
     *
     * @return Updated value.
     */
    public int advanceValue() {
        if (rng.nextBoolean() && currentValue < max)
            currentValue++;
        else if (currentValue > min)
            currentValue --;
        return getValue();
    }
}

