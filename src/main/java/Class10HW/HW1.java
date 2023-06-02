package Class10HW;

public class HW1 {
    public static void main(String[] args) {
        /*
        Create a 2D array(shorter way) in which first array will consist of 4 names
         and second array will contain grades.
        Then your program should print name of the students that has A and B grade
         */
        String [][] names={
                {"Halima", "Farwa", "Sir", "Asghar"},
                {"A", "B","C","D"},

        };
        // rows and then column
        System.out.println(names[0][0]);
        System.out.printf(names[0][1]);
    }
}

