public class example8 {
    public static void main(String[] args) {
        new Bike().startEngine();
        new Bus().startEngine();
        new Taxi().startEngine();
    }
}

class Vehicle {
    void startEngine(){
        System.out.println("Двигатель запущен");
    }
}

class Bike extends Vehicle {}
class Bus extends Vehicle {}
class Taxi extends Vehicle {}