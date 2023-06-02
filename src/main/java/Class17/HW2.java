package Class17;

public class HW2 {
    /*
    Write a java class that have 4 constructors with 4 different access levels of constructors(private,public,default,protected)
     and create 4 objects of this class: 1 - inside same class; 2 - from outside the class;
     3 - from different class inside different package  and observe result.
     */
    private String name;
    public int age;
    double weight;
   protected boolean haveBlackHair;

//Private constructor
    private HW2(String name){
        this.name=name;
    }
    //Public constructor
    public HW2(int age, String name){
        this.age=age;
        this.name=name;
    }
    //Default constructor
     HW2(double weight,int age, boolean haveBlackHair){
        this.weight=weight;
        this.age=age;
        this.haveBlackHair=haveBlackHair;
    }
    //Protected constructor
    protected HW2(String name, boolean haveBlackHair){
        //we have not yet been taught about protected
    }
    //another way to printout
    void printPrivate(){
        System.out.println(name);
    }
    public static void main(String[] args) {
        HW2 obj1= new HW2("Karen");
        obj1.printPrivate();
    }
}
