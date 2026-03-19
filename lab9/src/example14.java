public class example14 {
    public static void main(String[] args) {
        new Warrior().attack();
        new Mage().attack();
        new Archer().attack();
    }
}

class Character {
    void attack(){ System.out.println("Атака"); }
}

class Warrior extends Character {
    void attack(){ System.out.println("Удар мечом"); }
}

class Mage extends Character {
    void attack(){ System.out.println("Магическая атака"); }
}

class Archer extends Character {
    void attack(){ System.out.println("Выстрел из лука"); }
}