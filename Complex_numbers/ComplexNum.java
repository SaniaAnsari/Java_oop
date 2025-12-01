package Complex_numbers;

import java.text.DecimalFormat;

public class ComplexNum {
    double real;
    double imag;

    public ComplexNum(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public double getImag() {
        return imag;
    }
    public static ComplexNum add(ComplexNum c1,ComplexNum c2){
        double newreal=c1.real+c2.real;
        double newimag=c1.imag+c2.imag;

        return new ComplexNum(newreal,newimag);
    }
    public static ComplexNum subtract(ComplexNum c1,ComplexNum c2){
        double newreal=c1.real-c2.real;
        double newimag=c1.imag-c2.imag;

        return new ComplexNum(newreal,newimag);
    }
    public static ComplexNum multiply(ComplexNum c1,ComplexNum c2){
        double newreal=c1.real*c2.real-c1.imag*c2.imag;
        double newimag=c1.real*c2.imag+c1.imag*c2.real;
        return new ComplexNum(newreal,newimag);
    }

    public static ComplexNum conjugate(ComplexNum c){
        double newimag=-c.imag;
        return new ComplexNum(c.real,newimag);
    }
    public boolean equals(Object obj){
        if(this==obj){
            return  true;
        }
        if(obj==null||getClass()!=obj.getClass()){
            return false;
        }
        ComplexNum C=(ComplexNum) obj;
        return this.real==C.real&&this.imag==C.imag;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }





    private static final DecimalFormat df = new DecimalFormat("0.##");


    public String toString() {
        String realStr = df.format(real);
        String imaginaryStr = df.format(Math.abs(imag));

        if (imag >= 0) {
            return realStr + " + " + imaginaryStr + "i";
        } else {
            return realStr + " - " + imaginaryStr + "i";
        }
    }
}
