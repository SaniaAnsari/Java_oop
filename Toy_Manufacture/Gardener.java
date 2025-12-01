package Toy_Manufacture;

public class Gardener extends Teddy{
    public Gardener(String size, String color) {
        super(size, color);
    }

    @Override
    public void describe() {
        System.out.println("I am a "+getColor()+"."+" My job is water plants. "+"My size is "+getSize()+".");
    }
}
