package TestSuff;

public class stuff {
    private static  final int n=2;
    private String string;
    private int num;
    public stuff(String s, int num){
        this.num=num;
        string=s;
    }
    public void doSomething(double d){
        d=d-num;
        System.out.println(this);
    }
    public double changeSomething(String s){
        s=string;
        return num*n;
    }
    public String toString(){
        return string+" has "+num;
    }
}
