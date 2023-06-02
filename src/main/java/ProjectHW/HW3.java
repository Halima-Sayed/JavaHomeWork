package ProjectHW;

public class HW3 {
    public static void main(String[] args) {
        /*
        Create a 2D array or integer type where you will store
odd and even numbers. Develop a program which will
identify/print the even numbers only.
         */
        int[][] oddEvenNums = {
                {1, 4, 6, 8},
                {5, 7, 2, 3},
                {0, 20}
        };
        for (int[] oddEvenNum : oddEvenNums) {
            for (int i : oddEvenNum) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}
