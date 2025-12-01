package Toy_Manufacture;

public class Clown extends Bunny{
    public Clown(String size, String color) {
        super(size, color);
    }

    @Override
    public void describe() {
        System.out.println("I am a "+getColor()+"."+" My job is entertainer. "+"My size is "+getSize()+".");
    }
}
