import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Warrior warrior = new Warrior("Lucy", 100);
        Mage mage = new Mage("Eda", 100);
        Rogue rogue = new Rogue("Thief", 100);

        do {
            System.out.println("A new fight begins!");


            warrior.attack(mage);
            mage.castSpell(warrior);
            rogue.attack(mage);

            warrior.levelUp();
            mage.levelUp();
            rogue.levelUp();

            System.out.print("do you want another fight? (yes/no): ");
        } while (scanner.nextLine().equalsIgnoreCase("yes"));
        scanner.close();
        System.out.println("Game over. Thank you for playing!");
    }
}
