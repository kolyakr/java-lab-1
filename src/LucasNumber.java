/**
 * <b>Represents a Lucas number with its position in the sequence and value.</b>
 * <p>
 * This class provides methods to access the number's value, its position, and its last digit.
 * </p>
 */
public class LucasNumber {
    private int number;
    private long value;

    /**
     * Default constructor initializing the number and value to 0.
     */
    public LucasNumber() {
        this.number = 0;
        this.value = 0;
    }

    /**
     * Constructs a {@code LucasNumber} with the specified number and value.
     * @param number the position of the Lucas number in the sequence
     * @param value the value of the Lucas number
     */
    public LucasNumber(int number, long value) {
        this.number = number;
        this.value = value;
    }

    /**
     * Prints the Lucas number's position and value.
     * <p>
     * This method is used for displaying the details of the Lucas number.
     * </p>
     */
    public void getValue() {
        System.out.println("Number: " + this.number + "\nValue: " + this.value);
    }

    /**
     * Returns the last digit of the Lucas number's value.
     * @return the last digit of the number
     */
    public int getLastDigit() {
        long copyValue = this.value;
        int lastNumber = (int) (copyValue % 10);
        return lastNumber;
    }

    /**
     * Prints the Lucas number's position and value.
     * <p>
     * This method provides a formatted output of the Lucas number.
     * </p>
     */
    public void print() {
        System.out.println("Number: " + this.number + ", value: " + this.value);
    }
}
