package Class28HW;


public class ExceptionHW2 {
    /*
    Create a method checkUserName that will throw a runtime exception.
     Method should throw an exception when entered username is less than 5 characters.
     */
    public static void checkUserName(String userName){
        if(userName.length()<5){
            throw new RuntimeException("The user name entered is less than 5 characters");
        }
    }

    public static void main(String[] args) {
        try{
            checkUserName("Me");
            System.out.println("Username is valid");
        }catch (RuntimeException e){
            System.out.println("Username is NOT valid: "+e.getMessage());
        }
    }
}
