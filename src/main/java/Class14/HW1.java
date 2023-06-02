package Class14;

public class HW1 {

// Create a method that will say Hello in different language based on the country -
// that will be passed when method is executed.
    void languages(String a) {
        switch (a){
            case "Arabic":
                System.out.println("سلام");
                break;
            case "French":
                System.out.println("Bonjour");
                break;
            case "Korean":
                System.out.println("안녕하세요");
                break;
        }
    }
        public static void main (String[]args){
            HW1 sayHello = new HW1();
            sayHello.languages("Arabic");
            sayHello.languages("French");
            sayHello.languages("Korean");
        }
    }



