package Toy_Manufacture;

public class EngineDriver extends Teddy{
    public EngineDriver(String size, String color) {
        super(size, color);
    }

    @Override
    public void describe() {
        System.out.println("I am a "+getColor()+"."+" My job is drive engine. "+"My size is "+getSize()+".");
    }
}
