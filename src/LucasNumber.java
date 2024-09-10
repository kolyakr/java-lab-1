public class LucasNumber {
    private int number;
    private long value;

    public LucasNumber(int number, long value){
        System.out.println("create constructor");
        this.number = number;
        this.value = value;
    }

    public void getValue() {
        System.out.println("Number: " + this.number + "\nValue: " + this.value);
    }

    public int getLastDigit(){
        long copyValue = this.value;
        int lastNumber = (int)(copyValue % 10);
        return lastNumber;
    }
}
