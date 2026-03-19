public class example9 {
    public static void main(String[] args) {
        new CPU().showInfo();
        new RAM().showInfo();
        new GPU().showInfo();
    }
}

class Component {
    void showInfo(){ System.out.println("Компонент"); }
}

class CPU extends Component {
    void showInfo(){ System.out.println("Процессор"); }
}

class RAM extends Component {
    void showInfo(){ System.out.println("Оперативная память"); }
}

class GPU extends Component {
    void showInfo(){ System.out.println("Видеокарта"); }
}