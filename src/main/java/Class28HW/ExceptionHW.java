package Class28HW;

public class ExceptionHW {
    /*
    Create a method to check age eligibility that will throw a runtime exception.
    Method should throw an exception age is less than 16.
     */
    public static void checkAgeEligibility(int age){
        if(age<16){
            throw new RuntimeException("Your age is less than 16");
        }
    }

    public static void main(String[] args) {
        try{
            checkAgeEligibility(10);
            System.out.println("Eligible age");
        }catch (RuntimeException e){
            System.out.println("Not eligible: "+e.getMessage());
        }
    }
}
