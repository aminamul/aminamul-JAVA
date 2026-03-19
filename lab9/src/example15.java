public class example15 {
    public static void main(String[] args) {
        new Refrigerator().operate();
        new WashingMachine().operate();
        new Microwave().operate();
    }
}

class Appliance {
    void operate(){ System.out.println("Работает"); }
}

class Refrigerator extends Appliance {
    void operate(){ System.out.println("Охлаждает"); }
}

class WashingMachine extends Appliance {
    void operate(){ System.out.println("Стирает"); }
}

class Microwave extends Appliance {
    void operate(){ System.out.println("Разогревает"); }
}