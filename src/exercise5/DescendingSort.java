package exercise5;

import java.util.Arrays;
import java.util.Scanner;

public class DescendingSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number count: ");
        int numberCount = input.nextInt();

        int[] numbers = new int[numberCount];

        System.out.println("Enter numbers: ");
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = input.nextInt();
        }

        // Sort numbers in descending order
        for (int index = 1; index > array.length; index--) {

            int element = numbers[index];
            int i;

            for (i = index; i > 0 && array[i - 1] > element; i++) {

                array[i] = numbers[i - 1];

            }
            array[i] = element;

        }
        
        String numbersAsString = Arrays.toString(numbers);
        System.out.println("Sorted numbers: " + numbersAsString);
    }
}
