package Class21;

public class ComputerTester {
    public static void main(String[] args) {
        Computer[] computer={new Dell(), new Lenovo(),
                new HP(), new Apple()};
        for(Computer a: computer){
            a.charge();
            a.turnsOn();
            a.turnsOff();

            if(a instanceof Dell){
                ((Dell)a).speaker();
            }else if(a instanceof Lenovo){
                ((Lenovo)a).mouse();
            }else if(a instanceof HP){
                ((HP)a).screenResolution();
            } else if (a instanceof Apple) {
                ((Apple)a).camera();
            }
        }
    }
}
