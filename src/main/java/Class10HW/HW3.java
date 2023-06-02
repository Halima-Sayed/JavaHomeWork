package Class10HW;

public class HW3 {
    public static void main(String[] args) {
        /*
         Using 2D array create a grocery list.
         Inside you should have an array of veggies, fruits, dairy and sweets.
         Retrieve all values from that array using 2 different loops
         */
        String[][] groceryList = {
                {"Eggplant", "Carrot", "Spinach"},
                {"Blueberry","Banana","Watermelon","Peach"},
                {"Milk","Heavy cream"},
                {"Sugar","Cake","Ice cream","Nutella"}
        };
        for (int i = 0; i < groceryList.length; i++) {
            for (int j = 0; j < groceryList[i].length; j++) {
                System.out.print(groceryList[i][j]+" ");

            }
            System.out.println();

        }
        System.out.println();
        for (String[] strings : groceryList) {
            for (String string : strings) {
                System.out.print(string+" ");


            }
            System.out.println();


        }
    }
}
