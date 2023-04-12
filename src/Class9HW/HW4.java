package Class9HW;

public class HW4 {
    public static void main(String[] args) {
        /*
    Create an array of cars and store 6 elements into it.
    Using 2 different loops print all values from the array.

         */

        String[] cars = {"Tires", "Windows", "Steering Wheel", "Breaks", "Seat", "Key", "Battery"};
        for (int i = 0; i < cars.length; i++) {
            System.out.print(cars[i] + " ");

        }

        System.out.println();
        for (String car : cars) {
            System.out.println(car);

        }


    }


}



