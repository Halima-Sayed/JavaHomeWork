package Class26HW;

import java.util.HashMap;
import java.util.Map;

public class Employee {
    public static void main(String[] args) {
        /*
        Create a Map that will store Employee name and salary.
         Write a logic to retrieve an employee who gets the highest salary.
         Output should be in the below format
John Smith=$100000
         */
        Map<String, Double> a=new HashMap<>();
        a.put("Ted Mosby",120000.0);
        a.put("Marshal Erikson",130000.0);
        a.put("Lily Aldrin",90000.0);
        a.put("Barney Stinson",220000.0);
        a.put("Robin Scherbatsky",80000.0);

        double highestSal=Double.MIN_VALUE;;
        String empHighestSal=null;

        for(Map.Entry<String,Double> b:a.entrySet()){
           // String employeeName = b.getKey();
           // double salary = b.getValue();
            if (b.getValue()>highestSal){
                highestSal=b.getValue();
                empHighestSal=b.getKey();
            }
           /* if (salary>highestSal){
                highestSal=salary;
                empHighestSal=employeeName;
            }

            */
        }
        System.out.println(empHighestSal+" "+highestSal);
    }
}
