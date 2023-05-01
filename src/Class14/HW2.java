package Class14;

public class HW2 {
    /*
    Create a method createEmail().
    Based on values of users firstName, lastName and email type, your method should return complete email Address.
    Example:  createEmail(John, Snow, gmail) → johnsnow@gmail.com
     */

    String createEmail(String a, String b, char c, String d){

        return a + b + c + d;
    }

    public static void main(String[] args) {
        HW2 obj= new HW2();
       String firstName="John";
       String lastName="Snow";
       String type="gmail.com";
       char special='@';
       String result=obj.createEmail(firstName, lastName,special,type);
       System.out.println(result);


    }
}
