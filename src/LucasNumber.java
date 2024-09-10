public class LucasNumber {
    public int number;
    public int value;

    public LucasNumber(int number, int value){
        System.out.println("create constructor");
        this.number = number;
        this.value = value;
    }

    public void getValue(){
        System.out.println("Number: " + this.number + "\nValue: " + this.value);
    }
}
