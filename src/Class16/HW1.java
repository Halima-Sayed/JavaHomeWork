package Class16;

public class HW1 {

        /*
        Create a method that will take a String as a parameter and returns reversed String.
        Method should be available to all classes within your project and accessible by class name.
         */
      public String word(String a){
          StringBuilder sb = new StringBuilder(a);
          return sb.reverse().toString();

      }

    public static void main(String[] args) {
        HW1 obj=new HW1();
        System.out.println(obj.word("HELLO"));

    }

}
