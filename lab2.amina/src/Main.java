public class Main {

    /* =========================
       Задача 3. Область видимости
       ========================= */
    static int classField = 100; // поле класса

    public static void main(String[] args) {

        /* =========================
           Задача 1. Переменные и константы
           ========================= */
        int count = 10;
        double price = 99.99;
        boolean isActive = true;
        final double PI = 3.14159;

        System.out.println("=== Задача 1 ===");
        System.out.println("Количество: " + count);
        System.out.println("Цена: " + price);
        System.out.println("Активен: " + isActive);
        System.out.println("Константа PI: " + PI);


        /* =========================
           Задача 2. Примитивные и ссылочные типы
           ========================= */
        int number = 5;              // примитивный тип
        String text = "Привет";      // ссылочный тип

        System.out.println("\n=== Задача 2 ===");
        System.out.println("Примитивный тип int: " + number);
        System.out.println("Ссылочный тип String: " + text);


        /* =========================
           Задача 3. Область видимости
           ========================= */
        int localVariable = 50; // локальная переменная

        System.out.println("\n=== Задача 3 ===");
        System.out.println("Поле класса: " + classField);
        System.out.println("Локальная переменная: " + localVariable);


        /* =========================
           Задачи 4 и 5. Наследование и переопределение
           ========================= */
        System.out.println("\n=== Задачи 4 и 5 ===");

        Person person = new Student(); // полиморфизм
        person.name = "Иван";
        person.age = 20;

        Student student = (Student) person;
        student.group = "ИС-2204";

        person.displayInfo(); // вызывается переопределённый метод
    }
}

/* =========================
   Базовый класс Person
   ========================= */
class Person {
    String name;
    int age;

    void displayInfo() {
        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age);
    }
}

/* =========================
   Производный класс Student
   ========================= */
class Student extends Person {
    String group;

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Группа: " + group);
    }
}
