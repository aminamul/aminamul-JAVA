public class example2 {
    public static void main(String[] args) {
        System.out.println("Площадь круга: " + new Circle(5).area());
        System.out.println("Площадь прямоугольника: " + new Rectangle(4,6).area());
        System.out.println("Площадь треугольника: " + new Triangle(3,7).area());
    }
}

class Shape {
    double area(){ return 0; }
}

class Circle extends Shape {
    double r;
    Circle(double r){ this.r=r; }
    double area(){ return Math.PI*r*r; }
}

class Rectangle extends Shape {
    double w,h;
    Rectangle(double w,double h){ this.w=w; this.h=h; }
    double area(){ return w*h; }
}

class Triangle extends Shape {
    double b,h;
    Triangle(double b,double h){ this.b=b; this.h=h; }
    double area(){ return 0.5*b*h; }
}