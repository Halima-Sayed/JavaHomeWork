package ProjectHW;

public class HW9 {
    public static void main(String[] args) {
        /*
        Write a java program to find the second largest
number in the array?
         */

        int[] num = {1, 2, 3, 4, 5, 6};
        int largest = 0;
        int secondLargest = 0;

        if (num[0] > num[1]) {
            largest = num[0];
            secondLargest = num[1];
        } else {
            largest = num[1];
            secondLargest = num[0];
        }
        for (int i = 2; i < num.length; i++) {
            if (num[i] > largest) {
                secondLargest = largest;
                largest = num[i];
            } else if (num[i] > secondLargest) {
                secondLargest = num[i];
            }
        }
        System.out.println(secondLargest);
    }
}

       /* int [] num={1,2,3,4,5,6};
        int largest=num[0];
        int secondLargest=num[0];

        for (int i = 0; i < num.length; i++) {
            if (num[i]>largest ){
                secondLargest=largest;
                largest=num[i];
            } else if(num[i]>secondLargest) {
                secondLargest=num[i];
            }
        }
        System.out.println(secondLargest);

        */
