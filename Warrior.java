class Warrior extends Character {
    private int strength;
    private boolean armor;

    public Warrior(String name, int health) {
        super(name, health);
        this.strength = 10;
        this.armor = true;
    }
    public void attack(Character target) {
        target.setHealth(target.getHealth() - 10);
        System.out.println(getName() + " attacks " + target.getName() + " and deals 10 damage. " + target.getName() + "'s new health is " + target.getHealth());
    }
}
