package DynamicDispatch;

public class Main {
    public static  void main(String []args){
        ProGamer pro = new ProGamer();
        pro.username = "LunaByte";
        pro.rank = 12;

        Gamer g = pro;        // Upcasting — no slicing in Java!

        g.play(); // Calls overridden method in ProGamer (dynamic dispatch)
        // g.stream(); // Not accessible — reference type is Gamer

        // Downcast back to ProGamer
        ProGamer realPro = (ProGamer) g;
        realPro.stream();     // Works fine — full object still intact
    }
}
