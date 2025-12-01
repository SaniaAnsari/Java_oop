package Polymorphic_Array;

public class Q6 {
    public static void main (String[]args){
    Truck[]truck=new Truck[2];
    truck[0]=new HGV();
    truck[1]=new Garbage();
    for (int i=0;i< truck.length;i++){
        truck[i].load("stuff");
    }
  }
}
