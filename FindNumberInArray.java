package Lab5;

import java.util.Scanner;

public class FindNumberInArray {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int[] numbers = {53, 45, 30, 67, 23};
        int search, index = 0;
        boolean found = false;

        System.out.println("Enter search number: ");
        search = keyboard.nextInt();

        while (!(found)) {
            if (numbers[index] == search) {
                found = true;
                System.out.println(search + " has been found at location " + index);
            }//if
        index = index + 1;
        }//while

    }//main
}//class
