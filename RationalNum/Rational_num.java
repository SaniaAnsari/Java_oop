package RationalNum;

public class Rational_num {
    int num;
    int den;
    public Rational_num(int num,int den){
        if(den==0){
            System.out.println("denominator cannot br zero");
        }
        this.num=num;
        this.den=den;
        Simplify();
    }
    public  void Simplify(){
        int a=num;
        int b=den;
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        int gcd=a ; // Prevent divide by zero;
        num/=gcd;
        den/=gcd;
    }
    public Rational_num add(Rational_num other){
        int newNum=this.num*other.den+this.num*other.den;
        int newden=this.den*other.den;
        return new Rational_num (newNum,newden);
    }
    public Rational_num subtract(Rational_num other){
        int newNum=this.num*other.den-this.num*other.den;
        int newden=this.den*other.den;
        return new Rational_num (newNum,newden);
    }
    public String toString(){
        return num+"/"+den;
    }
}
