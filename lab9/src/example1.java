public class example1 {
    public static void main(String[] args) {
        Car c = new Car("Тойота",180);
        Train t = new Train("Экспресс",120);
        Airplane a = new Airplane("Боинг",900);

        c.move();
        t.move();
        a.move();
    }
}

class Transport {
    String name; int speed;
    Transport(String n,int s){ name=n; speed=s; }
    void move(){ System.out.println(name+" движется"); }
}

class Car extends Transport {
    Car(String n,int s){ super(n,s); }
    void move(){ System.out.println(name+" едет по дороге"); }
}

class Train extends Transport {
    Train(String n,int s){ super(n,s); }
    void move(){ System.out.println(name+" едет по рельсам"); }
}

class Airplane extends Transport {
    Airplane(String n,int s){ super(n,s); }
    void move(){ System.out.println(name+" летит"); }
}