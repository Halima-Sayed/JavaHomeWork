package Class9HW;

public class HW2 {
    public static void main(String[] args) {
        /*
        Create an array of names and store all names of your group.
         Then print your name from that array. (use 2 different ways of creating an array).
         */

        String[] names = {"Cinderella", "Bella", "Ariel", "Snow", "Halima"};
        for (int j = 0; j < names.length; j++) {
            if (j==4)
             System.out.print(names[j]);
        }
        System.out.println();
        String [] names2= new String[5];
        names2[0]="Cinderella";
        names2[1]="Bella";
        names2[2]="Ariel";
        names2[3]="Snow";
        names2[4]="Halima";
            System.out.println(names2[4]);
        }


    }



