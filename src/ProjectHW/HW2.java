package ProjectHW;

public class HW2 {
    public static void main(String[] args) {
 /*
 Create an array of integer values. After the array is
created, calculate the sum of all stored elements in
that array.
  */
        int [][] num={
                {1,3,5,6,8},
                {11,13,15,16,18},
                {0,0,0,1}
        };
        int sum=0;
        for (int[] ints : num) {
            for (int anInt : ints) {
                sum+=anInt;

            }
        }
        System.out.println("sum = " + sum);
    }
}
