package Prototype.Shallow;

import java.util.UUID;

public class Elf implements Hero {

    UUID heroID;
    int attack;
    int defense;
    int magic;
    int health;

    public Elf() {

        this.attack = HeroProperties.ELF_ATTACK.getValue();
        this.defense = HeroProperties.ELF_DEFENSE.getValue();
        this.magic = HeroProperties.ELF_MAGIC.getValue();
        this.health = 100;
    }

    @Override
    public void setID(UUID heroID) {

        this.heroID = heroID;

    }

    @Override
    public Elf clone() throws CloneNotSupportedException {

        try {
            return (Elf) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }


    @Override
    public String toString() {

        return "Elf{" +
                "attack=" + attack +
                ", defense=" + defense +
                ", magic=" + magic +
                ", health=" + health +
                '}';
    }
}
