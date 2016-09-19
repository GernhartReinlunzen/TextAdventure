package Model;

/**
 * Created by 204g06 on 16.09.2016.
 */
public class Creature {
    private String name;
    private int healthPoints;
    private int attackDamage;
    private int abilityPower;
    private int initiative;

    public Creature (String name,int healthPoints, int attackDamage ,int abilityPower, int initiative){
        this.name = name;
        this.healthPoints = healthPoints;
        this.attackDamage = attackDamage;
        this.abilityPower = abilityPower;
        this.initiative = initiative;

    }

    public String getName() {
        return name;
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
}
