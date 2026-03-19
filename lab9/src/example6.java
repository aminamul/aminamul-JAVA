public class example6 {
    public static void main(String[] args) {
        new Laptop("HP",65).turnOn();
        new Smartphone("Samsung",20).turnOn();
        new Tablet("Lenovo",30).turnOn();
    }
}

class Device {
    String brand; int power;
    Device(String b,int p){ brand=b; power=p; }

    void turnOn(){
        System.out.println(brand + " включается");
    }
}

class Laptop extends Device {
    Laptop(String b,int p){ super(b,p); }
}

class Smartphone extends Device {
    Smartphone(String b,int p){ super(b,p); }
}

class Tablet extends Device {
    Tablet(String b,int p){ super(b,p); }
}