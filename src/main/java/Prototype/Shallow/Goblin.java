package Prototype.Shallow;

import java.util.UUID;

public class Goblin implements Hero {

    UUID heroID;
    int attack;
    int defense;
    int magic;
    int health;

    public Goblin(){
        this.attack= HeroProperties.GOBLIN_ATTACK.getValue();
        this.defense= HeroProperties.GOBLIN_DEFENSE.getValue();
        this.magic= HeroProperties.GOBLIN_MAGIC.getValue();
        this.health=100;
    }

    @Override
    public void setID(UUID heroID) {
        this.heroID = heroID;
    }


    @Override
    public Goblin clone() throws CloneNotSupportedException {
        try {
            return (Goblin) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String toString() {
        return "Goblin{" +
                "attack=" + attack +
                ", defense=" + defense +
                ", magic=" + magic +
                ", health=" + health +
                '}';
    }
}
