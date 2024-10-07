
import java.util.Scanner;

/**
 * 
 * Determining Even/Odd Numbers
 * Difficulty: Easy
 * Topics: Basic Programming
 * Description: Write a program to check whether a number is even or odd.
 * Example:
 * Input: number = 4
 * Output: Even
 * Explanation: Since 4 is divisible by 2, it is an even number.
 * 
 **/

public class Question01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // for getting the input from user
        int number = scanner.nextInt();

        // int number = 10;

        if (number % 2 == 0) {
            System.out.println("Number is Even : " + number);

        }

        else if (number % 2 != 0) {

            {
                System.out.println("Number is Odd : " + number);
            }
        } else {
            System.out.println("Invailid input " + number);
        }

    }

}
