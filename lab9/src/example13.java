public class example13 {
    public static void main(String[] args) {
        new ProgrammingCourse().startCourse();
        new MathCourse().startCourse();
        new HistoryCourse().startCourse();
    }
}

class Course {
    void startCourse(){
        System.out.println("Курс начался");
    }
}

class ProgrammingCourse extends Course {}
class MathCourse extends Course {}
class HistoryCourse extends Course {}