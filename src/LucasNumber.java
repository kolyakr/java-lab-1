public class LucasNumber {
    private int number;
    private long value;

    public LucasNumber(int number, long value){
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

    public void print(){
        System.out.println("Number: " + this.number + ", value: " + this.value);
    }
}
