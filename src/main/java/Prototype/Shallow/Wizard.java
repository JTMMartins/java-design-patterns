package Prototype.Shallow;

import java.util.UUID;

public class Wizard implements Hero {

    UUID heroID;
    int attack;
    int defense;
    int magic;
    int health;

    public Wizard() {
        this.attack= HeroProperties.WIZARD_ATTACK.getValue();
        this.defense= HeroProperties.WIZARD_DEFENSE.getValue();
        this.magic= HeroProperties.WIZARD_MAGIC.getValue();
        this.health=100;
    }

    @Override
    public void setID(UUID heroID) {
        this.heroID = heroID;
    }


    @Override
    public Wizard clone() throws CloneNotSupportedException {
        try {
            return (Wizard) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String toString() {
        return "Wizard{" +
                "attack=" + attack +
                ", defense=" + defense +
                ", magic=" + magic +
                ", health=" + health +
                '}';
    }
}
