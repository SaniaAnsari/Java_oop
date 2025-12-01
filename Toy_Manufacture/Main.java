package Toy_Manufacture;

public class Main {
    public static void main(String []args){
        CuddlyToy E=new EngineDriver("small","blue");
        E.describe();
        E.makenoise();

        CuddlyToy G=new Gardener("large","red");
        G.describe();
        G.makenoise();

        CuddlyToy C=new Clown("medium","white");
        C.describe();
        C.makenoise();

        CuddlyToy B=new BankManager("Small","Blue");
        B.describe();
        B.makenoise();

    }
}
