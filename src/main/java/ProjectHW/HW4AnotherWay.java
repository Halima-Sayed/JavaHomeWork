package ProjectHW;

public class HW4AnotherWay {
    public static void main(String[] args) {
        /*
        Create a 2D array of integers. Develop a program
which will calculate the evenSum of even and odd numbers
for that array.
         */
        int[][] nums = {
                {1, 3, 5, 4},
                {2, 8, 9, 10}
        };

        int evenSum = 0;
        int oddSum = 0;
        for (int[] num : nums) {
            for (int i : num) {
                if (i % 2 != 0) {
                    oddSum += i;
                }else if (i%2==0){
                    evenSum+=i;
                }
            }
        }
        System.out.println("Sum of odd numbers in the 2D Array = "+ oddSum);
        System.out.println("Sum of even numbers in the 2D Array = "+ evenSum);
    }
}







