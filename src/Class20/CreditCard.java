package Class20;

public class CreditCard {
   /* Create a class CreditCard and define variable balance and interest.
   Create an instance method that will calculate interest based on the given balance.
      Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
      Call the method by creating an object of each of the three classes.
     */
    int balance;
    double interest;
    CreditCard(int balance, double interest){
    this.balance=balance;
    this.interest=interest;
}
    double calculateInterest(){
        return balance*interest;
    }

}
class Visa extends CreditCard{

    Visa(int balance, double interest) {
        super(balance, interest);
    }
}
class AX extends CreditCard{
    AX(int balance, double interest) {
        super(balance, interest);
    }
    @Override
    double calculateInterest() {
        return super.calculateInterest()/12;
    }
}
class CreditCardTester{
    public static void main(String[] args) {
        CreditCard obj1=new CreditCard(20000,0.18);
        System.out.println("Credit Card Interest: " + obj1.calculateInterest());
        Visa obj2=new Visa(20000,0.18);
        System.out.println("Credit Card Interest: " + obj2.calculateInterest());
        AX obj3=new AX(20000,0.18);
        System.out.println("Credit Card Interest: " + obj3.calculateInterest());
    }
}