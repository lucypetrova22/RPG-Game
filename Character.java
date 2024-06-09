class Character {
    private String name;
    private int health;
    private int mana;
    private int level;

    public Character(String name, int health) {
        this.name = name;
        this.health = health;
        this.mana = 100;
        this.level = 1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void attack(Character target) {
        System.out.println("Character attacks...");
    }

    

    public void castSpell(Character target) {
        System.out.println("Character casts a spell...");
    }

    public void levelUp() {
        this.level++;
        this.health += 10;
        this.mana += 10;
        System.out.println(getName() + " levels up! Level: " + this.level + ", Health: " + this.health + ", Mana: " + this.mana);
    }
}
