//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       Car car1=new Car();
       Car car2=new Car("black");
       Car car3=new Car("Silver",79000);
       car1.display();
       car2.display();
       car3.display();
    }
}