package Polymorphic_Array;

public class Truck {
    public void load(String payload){

    }
}
class Garbage extends Truck{
    @Override
    public  void load(String payload){
        System.out.println("our garbage truck eats "+payload);
    }
}
class HGV extends Truck{
    @Override
    public  void load(String payload){
        System.out.println("We are transporting "+ payload+"in our heavy good vehicle" );
    }
}
