class Rogue extends Character {
    private int agility;
    private int dexterity;

    public Rogue(String name, int health) {
        super(name, health);
        this.agility = 12;
        this.dexterity = 14;
    }


    public void attack(Character target) {
        target.setHealth(target.getHealth() - 12);
        System.out.println(getName() + " attacks " + target.getName() + " swiftly and deals 12 damage. " + target.getName() + "'s new health is " + target.getHealth());
    }
}
