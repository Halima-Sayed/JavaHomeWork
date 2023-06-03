package Class26HW;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Duplicates {
    public static void main(String[] args) {
        /*
        Create a collection of integers in which you can keep duplicates.
Write a logic to find sum of all integers
         */
        List<Integer> a=new ArrayList<>(Arrays.asList(111,222,333,111,444,555));
        int sum=0;
        for (Integer b : a) {
            sum+=b;
        }
        System.out.println("Sum= "+sum);

    }
}
