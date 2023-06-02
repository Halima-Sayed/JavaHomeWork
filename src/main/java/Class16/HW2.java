package Class16;

public class HW2 {
    /*
    Create a method that will accept a String as a parameter and return a new String that consist only of vowels.
    Method should be available inside the class only where it was declared and executed by calling it is name
     */
   private  String vowels(String a){
        return a.replaceAll("[^aeiouAEIOU]", "");

    }

    public static void main(String[] args) {
        HW2 obj=new HW2();
       // String vowels = obj.vowels("Butterfly");
        System.out.println(obj.vowels("Butterfly"));
    }

}
