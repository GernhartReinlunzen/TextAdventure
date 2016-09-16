package Model;

/**
 * Created by 204g06 on 16.09.2016.
 */
public class Creature {
    private int healthPoints;
    private int attackDamage;
    private int abilityPower;
    private int initiative;

    public Creature (int healthPoints, int attackDamage ,int abilityPower, int initiative){
        this.healthPoints = healthPoints;
        this.attackDamage = attackDamage;
        this.abilityPower = abilityPower;
        this.initiative = initiative;

    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public int getAttackDamage() {
        return attackDamage;
    }

    public void setAttackDamage(int attackDamage) {
        this.attackDamage = attackDamage;
    }

    public int getAbilityPower() {
        return abilityPower;
    }

    public void setAbilityPower(int abilityPower) {
        this.abilityPower = abilityPower;
    }

    public int getInitiative() {
        return initiative;
    }

    public void setInitiative(int initiative) {
        this.initiative = initiative;
    }

    public void angreifen(Creature enemy){
       enemy.setHealthPoints();
    }

    public void magischerAngriff(Creature enemy){
        enemy.healthPoints() = enemy.getHealthPoints() - this.getAbilityPower();

    }
}
