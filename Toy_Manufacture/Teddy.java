package Toy_Manufacture;

public class Teddy extends CuddlyToy{
    public Teddy(String size, String color) {
        super(size, color);
    }
    @Override
    public void makenoise(){
        System.out.println("teddy says: Growl!!");
    }
}
