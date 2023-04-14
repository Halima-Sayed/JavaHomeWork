package Class10HW;

public class HW5 {
    public static void main(String[] args) {
        /*
        Create a 2D array or integer type where you will store odd and even numbers in 3 rows and 4 columns.
         Develop a program which will identify/print the even numbers only.
         */
        int [][] evenOddnums={
                {1,4,5,6},
                {2,3,8,7},
                {9,10,11,12}

        };
        for (int i = 0; i < evenOddnums.length ; i++) {
            for (int j = 0; j < evenOddnums[i].length; j++) {
                if (evenOddnums[i][j]%2==0) {
                    System.out.print(evenOddnums[i][j]+" ");

                }


            }

        }
    }
}
