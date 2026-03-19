public class example11 {
    public static void main(String[] args) {
        new Player().play();
        new Coach().train();
        new Doctor().heal();
    }
}

class TeamMember {}

class Player extends TeamMember {
    void play(){ System.out.println("Игрок играет"); }
}

class Coach extends TeamMember {
    void train(){ System.out.println("Тренер тренирует"); }
}

class Doctor extends TeamMember {
    void heal(){ System.out.println("Доктор лечит"); }
}