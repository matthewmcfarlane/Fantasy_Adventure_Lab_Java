package Enemies;

public abstract class Enemy {

    private int healthPoints;

    public Enemy(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public String takeDamage(int damageValue){
        if(damageValue < this.healthPoints){
            this.healthPoints -= damageValue;
            return "Ouch";
        }else{
            this.healthPoints = 0;
            return "I am dead";
        }
    }


}
