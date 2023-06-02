package Class9HW;

import java.util.Arrays;

public class HW7 {
    public static void main(String[] args) {
        /*
        From an array of integer elements find the largest number.

         */

        int [] nums={5,10,15,20,25};
        int largeNum= nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]>largeNum){
                largeNum=nums[i];
            }
        }
        System.out.println(largeNum);

        }
    }

