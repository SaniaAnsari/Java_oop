package Practice_OF_Polymorphism;

public class Main {
    public static void main(String[] args) {
        A a = new A(); // GrandParent: A
        B b = new B(); // Parent: B
        C c = new C(); // Child: C
        A a2 = new C(); // Polymorphism GRANDPARENT -> CHILD

        // code candidates (blocks of code) (three lines) one of them at a time.
        b.m1();
        c.m2();
        a.m3();

        c.m1();
        c.m2();
        c.m3();

        a.m1();
        b.m2();
        c.m3();

        a2.m1();
        a2.m2();
        a2.m3();
    }
}
