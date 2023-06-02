package ProjectHW;

public class HW4 {
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
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if (nums[i][j] % 2 == 0) {
                    evenSum = evenSum + nums[i][j];
                } else {
                    oddSum = oddSum + nums[i][j];
                }

            }
        }
        System.out.println("The Sum of Even Numbers in this Array = " + evenSum);
        System.out.println(" The Sum of Odd Numbers in this Array = " + oddSum);
    }
}

       // for (int[] num : nums) {
         //   for (int i : num) {
           //     if (i%2!=0){
            //        sum+=i;
             //   } if (i%2==0) {




     //   System.out.println("Sum of odd numbers in the 2D Array = "+ sum);



