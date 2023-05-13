package Class21;

public class Computer {
    /*
    Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell.
    Define common behavior within and some fields in parent class and override some of the methods in child classes
    Define some methods specific to child classes
    Create objects of child classes and store them into array. Loop through each object and execute available methods.
     */
void charge(){
    System.out.println("Needs to be fully charged");
}
void turnsOn(){
    System.out.println("Computer turns on");
}
void turnsOff(){
    System.out.println("Computer turns off");
}

}
class Dell extends Computer{
    @Override
    void charge() {
        super.charge();
    }

    @Override
    void turnsOn() {
        super.turnsOn();
    }

    @Override
    void turnsOff() {
        super.turnsOff();
    }
    void speaker(){
        System.out.println("Speaker works perfectly");
    }
}
class Lenovo extends Computer{
@Override
    void charge(){
    System.out.println("Lenovo charges quickly");
}
@Override
    void turnsOn(){
    System.out.println("Takes time to turn on");
}

    @Override
    void turnsOff() {
        super.turnsOff();
    }
    void mouse(){
        System.out.println("Has a built in mouse");
    }
}
class HP extends Computer{
    @Override
    void charge(){
        System.out.println("Takes time to charge");
    }
    @Override
    void turnsOn(){
        System.out.println("Turns on quickly");
    }
    @Override
    void turnsOff(){
        System.out.println("Turns off quickly");
    }
    void screenResolution(){
        System.out.println("Has decent screen resolution");
    }

}
class Apple extends Computer{
    @Override
    void charge() {
        super.charge();
    }

    @Override
    void turnsOn() {
        super.turnsOn();
    }

    @Override
    void turnsOff() {
        super.turnsOff();
    }
    void camera(){
        System.out.println("The camera quality is good");
    }
}
