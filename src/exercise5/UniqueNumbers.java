package exercise5;

import java.util.Arrays;
import java.util.Scanner;

public class UniqueNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number count: ");
        int numberCount = input.nextInt();

        int[] numbers = new int[numberCount];

        System.out.println("Enter numbers: ");
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = input.nextInt();
        }

        int[] uniqueNumbers = new int[numbers.length];
        // Find unique numbers in numbers
        int next = 0;
        for (int i = 0; i< numbers.length; i++){
        boolean found = false;
        for (int j = 0; j< numbers.length; j++){
          if (numbers[i] == uniqueNumbers[j]){
            found = true;
            break;
          }
          }
          if(!found){
            uniqueNumbers [next] = numbers [i];
            next++;
          }
          }
        String uniqueNumbersAsString = Arrays.toString(uniqueNumbers);
        System.out.println("Unique numbers: " + uniqueNumbersAsString);
    }
}
