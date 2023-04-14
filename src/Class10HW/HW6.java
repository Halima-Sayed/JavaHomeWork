package Class10HW;

public class HW6 {
    public static void main(String[] args) {
        /*
        Create 2D array of countries: north america countries,
        south america countries, europe countries, asian countries, african countries.
        Then print all values from that array using 2 different loops
         and calculate how many total countries been stored.
         */
        String[][] countries = {
                {"USA", "Canada", "Mexico"},
                {"Afghanistan", "UAE", "Pakistan", "India"},
                {"Nigeria", "Ghana", "Tanzania", "Kenya", "Uganda"}
        };

        for (int i = 0; i < countries.length; i++) {
            for (int j = 0; j < countries[i].length; j++) {
                System.out.print(countries[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (String[] country : countries) {
            for (String s : country) {
                System.out.print(s + " ");
            }
            System.out.println();
        }
        System.out.println();
        int count = 0;
        for (int i = 0; i < countries.length; i++) {
            count += countries[i].length;
        }
        System.out.println("Total number of countries: " + count);
    }
}




