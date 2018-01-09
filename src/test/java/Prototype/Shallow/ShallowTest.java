package Prototype.Shallow;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ShallowTest {

    private Hero elf;
    private Hero goblin;
    private Hero wizard;
    private HeroWarehouse heroWarehouse;
    private Board gameboard;
    @Before
    public void instantiateAndStoreOriginalHeroes(){
        heroWarehouse = new HeroWarehouse();

        elf = new Elf();
        goblin = new Goblin();
        wizard = new Wizard();
        heroWarehouse.add(elf);
        heroWarehouse.add(goblin);
        heroWarehouse.add(wizard);
        gameboard = new Board();

    }

    @Test
    public void verifyInstancesNotNull(){
        Assert.assertNotNull(elf);
        Assert.assertNotNull(goblin);
        Assert.assertNotNull(wizard);
    }

    @Test
    public void verifyCloneIsANewObject(){
        Hero wizardClone=null;
        Hero goblinClone=null;
        Hero elfClone=null;
        try {
            wizardClone=heroWarehouse.get("Wizard").clone();
            goblinClone=heroWarehouse.get("Goblin").clone();
            elfClone=heroWarehouse.get("Elf").clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        Assert.assertNotEquals(elf,elfClone);
        Assert.assertNotEquals(goblin,goblinClone);
        Assert.assertNotEquals(wizard,wizardClone);
    }
}
