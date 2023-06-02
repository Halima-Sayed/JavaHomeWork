package ProjectHW;

public class HW8 {
    public static void main(String[] args) {


        // Maximum and minimum number in the array?
        int [] num={5,10,12,15,18};

        int max=num[0];
        int min=num[0];

        for (int i = 0; i < num.length; i++) {
            if (num[i]>max){
                max=num[i];
            } else if (num[i]<min) {
                min=num[i];
            }
        }
        System.out.println("Max number = "+max);
        System.out.println("Min number = "+min);
    }
}
