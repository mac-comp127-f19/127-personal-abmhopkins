package activityStarterCode.objects;

public class DiceRoller {
    public static void main(String[] args) {
        Die die1 = new Die();
        Die die2 = new Die();
        int diceAgree = 0;

        for(int i=0 ; i < 10 ; i++){
            die1.roll();
            System.out.println("Roll " + (i+1) + " generated a " + die1.toString());
        }

        for(int rolls = 0; rolls < 1000000; rolls++){
            die1.roll();
            die2.roll();
            if (die1.getValue()==die2.getValue())
                diceAgree ++;
        }

        System.out.println("In 1,000,000 roles, the dice agreed "+ diceAgree + " times");
    }

}
