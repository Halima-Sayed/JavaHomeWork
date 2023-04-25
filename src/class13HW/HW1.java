package class13HW;

public class HW1 {
    public static void main(String[] args) {
       /*
        How would you reverse a String word by word? for example
        // input=>This is sentence i want to reverse
        // output=>sihT si ecnetnes i tnaw ot esrever
         */
        String str = "This is sentence i want to reverse";
        String[] result = str.split(" ");
        for (String s : result) {
            ReverseEachWord(s);
        }
    }
    public static void ReverseEachWord(String s) {
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev += s.charAt(i);
        }
        System.out.print(rev + " ");
    }
}




