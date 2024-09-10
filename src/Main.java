
public class Main {
    public static void main(String[] args) {
        LucasNumber a = new LucasNumber(10, 24897);
        a.getValue();
        int lastDigit = a.getLastDigit();
        System.out.println("last digit: " + lastDigit);
    }
}