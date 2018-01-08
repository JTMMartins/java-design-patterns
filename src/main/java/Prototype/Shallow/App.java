package Prototype.Shallow;

public class App {

    public static void main(String[] args) throws CloneNotSupportedException {

        HeroWarehouse heroWarehouse = new HeroWarehouse();

        Hero elf = new Elf();
        Hero goblin = new Goblin();
        Hero wizard = new Wizard();
        heroWarehouse.add(elf);
        heroWarehouse.add(goblin);
        heroWarehouse.add(wizard);

        Board gameboard = new Board();

        for (int i = 0; i <= 5; i++) {

            gameboard.add(heroWarehouse.get("Wizard").clone());
            gameboard.add(heroWarehouse.get("Goblin").clone());
            gameboard.add(heroWarehouse.get("Elf").clone());

        }
    }
}
