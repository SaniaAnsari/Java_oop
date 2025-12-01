public class Car {
    String color;
    float price;

    Car() {
        this.color = "unknown";
        this.price = 0;
    }
    Car(String color){
        this.color=color;
        this.price=0;
    }
    Car(String color,float price){
        this.color=color;
        this.price=price;
    }
    public void display(){
        System.out.println(color);
        System.out.println(price);
    }
}
