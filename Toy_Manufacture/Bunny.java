package Toy_Manufacture;

public class Bunny extends CuddlyToy{
    public Bunny(String size, String color) {
        super(size, color);
    }
    @Override
    public void makenoise(){
        System.out.println("Bunny says: squeak!!");
    }
}
