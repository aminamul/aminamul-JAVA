public class example7 {
    public static void main(String[] args) {
        new Lion().makeSound();
        new Elephant().makeSound();
        new Monkey().makeSound();
    }
}

class Animal {
    void makeSound(){ System.out.println("Животное издает звук"); }
}

class Lion extends Animal {
    void makeSound(){ System.out.println("Лев рычит"); }
}

class Elephant extends Animal {
    void makeSound(){ System.out.println("Слон трубит"); }
}

class Monkey extends Animal {
    void makeSound(){ System.out.println("Обезьяна кричит"); }
}