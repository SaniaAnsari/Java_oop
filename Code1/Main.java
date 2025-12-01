package Code1;

public class Main {
    public static void main(String[]
                                    args) {
        Animal a = new Animal("Godzilla", 10);
        Cat c = new Cat("Mano", 6);
        Dog d = new Dog("Fido", 4);
        a.greet();
        c.greet();
        d.greet();
        a = c;
        ((Cat) a).greet();
        a.greet();

    }
}

