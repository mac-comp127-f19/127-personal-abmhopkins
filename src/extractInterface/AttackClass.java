package extractInterface;

import java.util.Random;

public class AttackClass {
    private static final Random rand = new Random();

    private final int swordMinDamage, swordMaxDamage;
    private final int fireballDamage;
    private final int fireballManaRequired;

    public AttackClass(int swordMinDamage, int swordMaxDamage, int fireballDamage, int fireballManaRequired) {
        this.swordMinDamage = swordMinDamage;
        this.swordMaxDamage = swordMaxDamage;
        this.fireballDamage = fireballDamage;
        this.fireballManaRequired = fireballManaRequired;
    }

    public String attack(GameCharacter attacker, GameCharacter target) {
        if (fireballDamage > 0) {
            if (attacker.useMana(fireballManaRequired)) {
                target.takeDamage(fireballDamage);
                return attacker.getName() + " hit " + target.getName() + " with a fireball for "
                    + fireballDamage + " points of damage";
            } else {
                return attacker.getName() + " did not have enough mana for a fireball attack";
            }
        } else {
            int damage = rand.nextInt(swordMaxDamage - swordMinDamage + 1) + swordMinDamage;
            target.takeDamage(damage);
            return attacker.getName() + " struck " + target.getName() + " with a sword for "
                + damage + " points of damage";
        }
    }
}
