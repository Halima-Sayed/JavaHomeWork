package ProjectHW;

public class HW1 {
    public static void main(String[] args) {
        /*
        Create a program that uses an array to store a list of
temperatures for a week, and then uses a loop to find
the highest and lowest temperature for the week.
*/
        double[][] temp = {{22.3, -0, 13.5},
                {50.5, 60, -15, 100}
        };
        double max = temp[0][0];
        double min = temp[0][0];


        for (double[] doubles : temp) {
            for (double aDouble : doubles) {
                if (aDouble > max) {
                    max = aDouble;
                } else if (aDouble < min) {
                    min = aDouble;
                }
            }
        }
        System.out.println("min = " + min);
        System.out.println("max = " + max);
    }
}

