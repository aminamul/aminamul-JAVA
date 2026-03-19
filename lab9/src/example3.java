public class example3 {
    public static void main(String[] args) {
        new Manager("Али",5000).work();
        new Developer("Сара",4000).work();
        new Designer("Джон",3000).work();
    }
}

class Employee {
    String name; double salary;
    Employee(String n,double s){ name=n; salary=s; }
    void work(){ System.out.println(name+" работает"); }
}

class Manager extends Employee {
    Manager(String n,double s){ super(n,s); }
    void work(){ System.out.println(name+" управляет командой"); }
}

class Developer extends Employee {
    Developer(String n,double s){ super(n,s); }
    void work(){ System.out.println(name+" пишет код"); }
}

class Designer extends Employee {
    Designer(String n,double s){ super(n,s); }
    void work(){ System.out.println(name+" создает дизайн"); }
}