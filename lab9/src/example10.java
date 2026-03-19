public class example10 {
    public static void main(String[] args) {
        new Food(10).showPrice();
        new Electronics(100).showPrice();
        new Clothes(50).showPrice();
    }
}

class Product {
    double price;
    Product(double p){ price=p; }

    void showPrice(){
        System.out.println("Цена: " + price);
    }
}

class Food extends Product {
    Food(double p){ super(p); }
}

class Electronics extends Product {
    Electronics(double p){ super(p); }
}

class Clothes extends Product {
    Clothes(double p){ super(p); }
}