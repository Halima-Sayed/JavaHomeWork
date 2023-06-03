package Class26HW;

import java.util.LinkedHashSet;
import java.util.Set;

public class Concatenate {
    /*
     Create the collection that will store single uniques Objects of a String type in which order is preserved.
Write a logic to concatenate all string from the collection.
     */
    public static void main(String[] args) {
        Set<String> a=new LinkedHashSet<>();
        a.add("Hi");
        a.add("how");
        a.add("are");
        a.add("you");
        a.add("doing");
        a.add("today?");

        StringBuilder strB=new StringBuilder();
        for (String b : a) {
            strB.append(b);
        }
        System.out.println(strB.toString());
    }
}
