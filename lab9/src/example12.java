public class example12 {
    public static void main(String[] args) {
        new Guitar().playSound();
        new Piano().playSound();
        new Drums().playSound();
    }
}

class Instrument {
    void playSound(){ System.out.println("Звук"); }
}

class Guitar extends Instrument {
    void playSound(){ System.out.println("Звук гитары"); }
}

class Piano extends Instrument {
    void playSound(){ System.out.println("Звук пианино"); }
}

class Drums extends Instrument {
    void playSound(){ System.out.println("Звук барабанов"); }
}