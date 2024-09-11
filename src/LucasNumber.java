public class LucasNumber {
    private int number;
    private long value;

    /**
     * LucasNumber`s constructor
     * @param number number of lucas number in the row
     * @param value value of lucas number in the row
     */

    public LucasNumber(int number, long value){
        this.number = number;
        this.value = value;
    }

    public void getValue() {
        System.out.println("Number: " + this.number + "\nValue: " + this.value);
    }

    /**
     * Return last digit of lucas number
     * @return last digit in number
     */

    public int getLastDigit(){
        long copyValue = this.value;
        int lastNumber = (int)(copyValue % 10);
        return lastNumber;
    }

    public void print(){
        System.out.println("Number: " + this.number + ", value: " + this.value);
    }
}
