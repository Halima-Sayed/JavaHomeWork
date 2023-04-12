package Class9HW;

import java.util.Scanner;

public class ffbfdh {

    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) { //rows
            for (int j = 0; j < 4; j++) { //columns
                if (i == 1 && j == 1 || i == 1 && j == 2 || i == 2 && j == 1 || i == 2 && j == 2) {
                    System.out.print(" ");

                } else {
                    System.out.print('$');
                }


            }
            System.out.println();
        }
        System.out.println("-----------------");
        for (int w = 0; w < 4; w++) { //rows
            for (int t = 0; t < 4; t++) { //columns
                if (w==4 || t>=3){
                    System.out.print('$');

                }
                }

            }
            System.out.println();

        }
    }

