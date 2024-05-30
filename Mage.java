class Mage extends Character {
    private int intelligence;
    private int spellPower;

    public Mage(String name, int health) {
        super(name, health);
        this.intelligence = 10;
        this.spellPower = 15;
    }


    public void castSpell(Character target) {
        target.setHealth(target.getHealth() - 15);
        System.out.println(getName() + " casts a spell on " + target.getName() + " and deals 15 damage. " + target.getName() + "'s new health is " + target.getHealth());
    }
}
