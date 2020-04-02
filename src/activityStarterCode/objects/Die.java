package activityStarterCode.objects;

import java.util.Random;

public class Die {
    private static final int DEFAULT_MAX_VALUE = 6;

    private static Random random = new Random();
    private final int maxValue;
    private int value = -1;

    public Die() {
        this(DEFAULT_MAX_VALUE);
    }

    public Die(int maxValue) {
        this.maxValue = maxValue;
    }
    public void roll(){
        value = random.nextInt(maxValue) + 1;
    }
    public int getValue(){
        return value;
    }
    @Override
    public String toString() {
        switch(value){
            case 1:
                return "one";
            case 2:
                return "two";
            case 3:
                return "three";
            case 4:
                return "four";
            case 5:
                return "five";
            case 6:
                return "six";
            case 7:
                return "seven";
            case 8:
                return "eight";
            case 9:
                return "nine";
            case 10:
                return "ten";
            case 11:
                return "eleven";
            case 12:
                return "tweleve";
            default:
                return "unknown";
        }
    }

}
