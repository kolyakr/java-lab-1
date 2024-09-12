import java.util.Scanner;

/**
 * <b>Main class of the program for calculating and displaying Lucas numbers and their properties.</b>
 * <p>
 * This class contains the main method {@link #main(String[])}, which performs the calculation and
 * display of Lucas numbers.
 * </p>
 * @author <i>Mykola Kryvoruchko</i>
 * @version 1.0
 */
public class Main {

    /**
     * The main method of the program that calculates and displays Lucas numbers.
     * <p>
     * This method prompts the user to input the number of Lucas numbers to generate and a digit to search for.
     * It then generates the Lucas numbers, prints them, and prints those with the same last digit as the specified digit.
     * </p>
     * @param args an array of strings passed from the command line (not used in this method)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = 0;
        int digit = 0;
        try {
            System.out.println("Write number of Lucas numbers row: ");
            while(!scanner.hasNextInt()){
                System.out.println("Invalid input. Please enter an integer:");
                scanner.next();
            }
            N = scanner.nextInt();
            System.out.println("Write digit: ");
            while(!scanner.hasNextInt()){
                System.out.println("Invalid input. Please enter an integer:");
                scanner.next();
            }
            digit = scanner.nextInt();
            if(digit > 9 || digit < 0){
                System.out.println("Digit must be from 0 to 9");
                return;
            }
            LucasNumber[] array = generateLucasNumbers(N);
            printLucasNumbers(array);
            printSameLastDigitNums(array, digit);
        } catch (RuntimeException e) {
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     * Generates an array of Lucas numbers.
     * <p>
     * The Lucas sequence starts with 2 and 1. Each subsequent number is the sum of the two preceding ones.
     * </p>
     * @param N the number of Lucas numbers to generate
     * @return an array of {@link LucasNumber} objects containing the generated Lucas numbers
     */
    public static LucasNumber[] generateLucasNumbers(int N) {
        if (N <= 0) {
            System.out.println("Invalid input. Please write a number greater than 0");
            return null;
        }
        LucasNumber[] array = new LucasNumber[N];

        long value = 0;
        long firstNum = 2;
        long secondNum = 1;
        for (int i = 0; i < N; i++) {
            if (i == 0 || i == 1) {
                value = i == 0 ? 2 : 1;
            } else {
                value = firstNum + secondNum;
                firstNum = secondNum;
                secondNum = value;
            }
            LucasNumber x = new LucasNumber(i + 1, value);
            array[i] = x;
        }

        return array;
    }

    /**
     * Prints a row of Lucas numbers.
     * <p>
     * This method prints each Lucas number in the array in a formatted manner.
     * </p>
     * @param array an array of {@link LucasNumber} objects to be printed
     */
    public static void printLucasNumbers(LucasNumber[] array) {
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
        System.out.println("Lucas numbers row:");
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                array[i].print();
            }
        }
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
    }

    /**
     * Prints all Lucas numbers that have the same last digit as the specified digit.
     * <p>
     * This method compares the last digit of each Lucas number with the specified digit and prints those that match.
     * </p>
     * @param array an array of {@link LucasNumber} objects to be checked
     * @param digit the digit to compare with the last digit of the Lucas numbers
     */
    public static void printSameLastDigitNums(LucasNumber[] array, int digit) {
        int number = 0;
        System.out.println("Numbers with the same last digit(" + digit + "):");
        for (int i = 0; i < array.length; i++) {
            int numsDigit = array[i].getLastDigit();
            if (numsDigit == digit) {
                array[i].print();
                number++;
            }
        }

        if (number != 0) {
            System.out.println("General number: " + number);
        } else {
            System.out.println("Row of Lucas numbers doesn't have numbers with the same last digits");
        }
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
    }
}
