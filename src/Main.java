import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write number of Lucas numbers row: ");
        int N = scanner.nextInt();

        generateLucasNumbers(N);
    }

    public static void generateLucasNumbers(int N){
        if(N <= 0){
            System.out.println("Invalid input. Please write number bigger than 0");
            return;
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

        printLucasNumbers(array);
    }

    public static void printLucasNumbers(LucasNumber[] array){
        for(int i = 0; i < array.length; i++){
            if(array[i] != null){
                array[i].print();
            }
        }
    }
}