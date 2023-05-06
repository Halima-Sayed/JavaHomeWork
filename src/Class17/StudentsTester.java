package Class17;

public class StudentsTester {
    public static void main(String[] args) {
        Students student1 = new Students("Ted Mosby", 100, 80, 100);
        student1.calculateAverageGrade();
        Students student2 = new Students("Marshal Erikson", 100, 100, 100);
        student2.calculateAverageGrade();
        Students student3 = new Students("Lily Aldrin", 70, 70, 100);
        student3.calculateAverageGrade();
        Students student4 = new Students("Barney Stinson", 0, 0, 0);
        student4.calculateAverageGrade();
        Students student5 = new Students("Robin Scherbatsky", 0, 80, 65);
        student5.calculateAverageGrade();

    }
}
