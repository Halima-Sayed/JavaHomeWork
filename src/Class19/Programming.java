package Class19;

public class Programming {
    /*Create a class named 'Programming'. While creating an object of the class, if nothing is passed to it,
     then the message "I love programming languages" should be printed.
     If some String is passed to it, then in place of "programming languages" the value variable should be printed.
     Example, if we pass "Java", then "I love Java" should be printed.
     */

   Programming(){
        System.out.println("I love programming language");
    }
    Programming(String word){

        System.out.println("I love "+word);
    }
}
class ProgrammingTester {
    public static void main(String[] args) {
        Programming obj1 = new Programming();
        Programming obj2 = new Programming("Java");
    }
}
