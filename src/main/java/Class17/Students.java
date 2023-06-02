package Class17;

import Class14.Student;

public class Students {
    /* Write a java Class Students that have a constructor which takes students name and 3 subject grades.
    Inside your class also have a method to Calculate Average Grade.
     Test Student class for 5 different students with different marks.
     Your program should print an average mark of each students name.
     */
    String name;
    int mathGrade;
    int scienceGrade;
    int englishGrade;

    Students(String name, int mathGrade, int scienceGrade, int englishGrade){
        this.name=name;
        this.mathGrade=mathGrade;
        this.scienceGrade=scienceGrade;
        this.englishGrade=englishGrade;

    }

    void calculateAverageGrade(){
        int avGrade= mathGrade+scienceGrade+englishGrade;
        double result=avGrade/3;
        System.out.println(result);

    }
}
