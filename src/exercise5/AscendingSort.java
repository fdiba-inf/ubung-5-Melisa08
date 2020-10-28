package exercise5;

import java.util.Arrays;
import java.util.Scanner;

public class AscendingSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number count: ");
        int numberCount = input.nextInt();

        int[] numbers = new int[numberCount];

        System.out.println("Enter numbers: ");
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = input.nextInt();
        }
        int[] array = {9, 2, 1, -4, 0};

        for (int index = 1; index < array.length; index++) {

            int element = array[index];
            int i;

            for (i = index; i > 0 && array[i - 1] > element; i--) {

                array[i] = array[i - 1];

            }
            array[i] = element;

        }
        String numbersAsString = Arrays.toString(numbers);
       System.out.println("Sorted array: " + Arrays.toString(array));

    
    }
}
