package Prototype.Shallow;

public enum HeroProperties {

    ELF_ATTACK(60),
    ELF_DEFENSE(80),
    ELF_MAGIC(32),
    GOBLIN_ATTACK(75),
    GOBLIN_DEFENSE(80),
    GOBLIN_MAGIC(32),
    WIZARD_ATTACK(75),
    WIZARD_DEFENSE(80),
    WIZARD_MAGIC(32);

    private final int value;

    HeroProperties(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
