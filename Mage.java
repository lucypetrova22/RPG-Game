class Mage extends Character {
    private int intelligence;
    private int spellPower;

    public Mage(String name, int health) {
        super(name, health);
        this.intelligence = 10;
        this.spellPower = 15;
    }

    
    public void castSpell(Character target) {
        if (getMana() >= 15) {
            target.setHealth(target.getHealth() - 15);
            setMana(getMana() - 15);
            System.out.println(getName() + " casts a spell on " + target.getName() + " and deals 15 damage. " + target.getName() + "'s new health is " + target.getHealth() + ". " + getName() + "'s remaining mana is " + getMana());
        } else {
            System.out.println(getName() + " does not have enough mana to cast a spell.");
        }
    }

    
    public void levelUp() {
        super.levelUp();
        this.intelligence += 2;
        this.spellPower += 3;
        System.out.println(getName() + "'s intelligence increases to " + this.intelligence + " and spell power increases to " + this.spellPower);
    }
}
