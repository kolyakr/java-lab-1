
public class Main {
    public static void main(String[] args) {
        generateLucasNumbers(10);
    }

    public static void generateLucasNumbers(int N){
       if(N <= 0){
           System.out.println("Invalid input. Please write number bigger than 0");
           return;
       }

       long firstNum = 2;
       long secondNum = 1;
       for(int i = 1; i <= N; i++){
           if(i == 1 || i == 2){
               int value = i == 1 ? 2 : 1;
               System.out.println("Number: " + i + ", value: " + value);
           }else{
               long value = firstNum + secondNum;
               firstNum = secondNum;
               secondNum = value;
               System.out.println("Number: " + i + ", value: " + value);
           }
       }
    }
}