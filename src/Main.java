import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = 0;
        int digit = 0;
        try{
            System.out.println("Write number of Lucas numbers row: ");
            N = scanner.nextInt();
            System.out.println("Write digit: ");
            digit = scanner.nextInt();
            LucasNumber[] array = generateLucasNumbers(N);
            printLucasNumbers(array);
            printSameLastDigitNums(array, digit);
        }catch(RuntimeException e){
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static LucasNumber[] generateLucasNumbers(int N){
        if(N <= 0){
            System.out.println("Invalid input. Please write number bigger than 0");
            return null;
        }
        LucasNumber[] array = new LucasNumber[N];

        long value = 0;
        long firstNum = 2;
        long secondNum = 1;
        for(int i = 0; i < N; i++){
           if(i == 0 || i == 1){
               value = i == 0 ? 2 : 1;
           }else{
               value = firstNum + secondNum;
               firstNum = secondNum;
               secondNum = value;
           }
           LucasNumber x = new LucasNumber(i + 1, value);
           array[i] = x;
       }

        return array;
    }

    public static void printLucasNumbers(LucasNumber[] array){
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
        System.out.println("Lucas numbers row:");
        for(int i = 0; i < array.length; i++){
            if(array[i] != null){
                array[i].print();
            }
        }
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
    }

    public static void printSameLastDigitNums(LucasNumber[] array, int digit){
        int number = 0;
        System.out.println("Numbers with the same last digit(" + digit + "):");
        for(int i = 0; i < array.length; i++){
            int numsDigit = array[i].getLastDigit();
            if(numsDigit == digit){
                array[i].print();
                number++;
            }
        }

        if(number != 0){
            System.out.println("General number: " + number);
        }else{
            System.out.println("Row of Lucas numbers don`t have numbers with the same last digits");
        }
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
    }
}