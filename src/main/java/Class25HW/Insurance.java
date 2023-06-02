package Class25HW;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class Insurance {
        /*
        Create a class Insurance that will have an attribute as insuranceName and unimplemented behaviour as getQuote and cancelInsurance.
        Create 3 subclasses Car, Pet, Health. Car class has it’s own attribute as carModel and Class Pet has petType attribute.
        Create 3 objects of the sub classes and store them in ArrayList. Using for loop/advanced for loop/ iterator access all methods of the class.
        Create a Card class that will have interest rate field and card type
        and a constructor that will initialize the fields.

         */
        String insuranceName;


       public abstract double getQuote();

      public abstract String cancelInsurance();

}
class Car extends Insurance{

    String carModel;

    public Car(String carModel) {
        this.carModel = carModel;
    }

    @Override
    public double getQuote() {
        return 888.9;
    }

    @Override
   public String cancelInsurance() {
        return "Car Insurance for "+carModel+" is cancelled";
    }
}
class Pet extends  Insurance{
    String petType;

    public Pet(String petType) {
        this.petType = petType;
    }

    @Override
    public double getQuote() {
        return 66.8;
    }

    @Override
    public String cancelInsurance() {
        return "Your pet insurance for "+petType+" is cancelled";
    }
}
class Health extends Insurance{

    @Override
    public double getQuote() {
        return 200.50;
    }

    @Override
    public String cancelInsurance() {
        return "Your health insurance has been cancelled";
    }
}
class InsuranceTester{
    public static void main(String[] args) {
        List<Insurance> a=new ArrayList<>();

        a.add(new Car("Jeep Wrangler"));
        a.add(new Pet("Cat"));
        a.add(new Health());

        for (Insurance insurance : a) {
            System.out.println("Quote " + insurance.getQuote());
            System.out.println(insurance.cancelInsurance());
        }
        System.out.println("----------------------------------------");

            for(int i=0; i<a.size(); i++){
                System.out.println("Quote "+a.get(i).getQuote());
                System.out.println(a.get(i).cancelInsurance());
            }
        System.out.println("----------------------------------------");

        Iterator<Insurance> insuranceIterator=a.iterator();
        while (insuranceIterator.hasNext()){
            Insurance insurance=insuranceIterator.next();
            System.out.println("Quote "+insurance.getQuote());
            System.out.println(insurance.cancelInsurance());
        }

        }

    }
