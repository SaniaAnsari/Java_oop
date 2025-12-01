package Toy_Manufacture;

public class BankManager extends Bunny{
    public BankManager(String size, String color) {
        super(size, color);
    }

    @Override
    public void describe() {
        System.out.println("I am a "+getColor()+"."+" My job is BankManager. "+"My size is "+getSize()+".");
    }
}
