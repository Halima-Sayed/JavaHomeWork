package ProjectHW;

public class HW10 {
    public static void main(String[] args) {
        /*
         Write a program to print out duplicate elements from
an Array of Strings
         */
        String[] array = {"hi", "hey", "hi", "hello", "hey", "bye", "bye"};

        for (int i = 0; i < array.length-1; i++)
        {
            for (int j = i+1; j < array.length; j++)
            {
                if (array[i]==array[j]){
                //if( (array[i].equals(array[j])))

                    System.out.println("Duplicate Element is "+array[j]);
                }
            }
        }
    }
}