package Triangle;

public class triangle {
    double sideA;
    double sideB;
    double sideC;
    static int count = 0;

    public triangle() {
        this.sideA = 1.0;
        this.sideB = 1.0;
        this.sideC = 1.0;
        count++;
    }
    public triangle(double x) {
        this.sideA = x;
        this.sideB = x;
        this.sideC = x;
        count++;
    }
    public triangle(double x, double y) {
        this.sideA = x;
        this.sideB = x;
        this.sideC = y;
        count++;
    }
    public triangle(double x, double y, double z) {
        this.sideA = x;
        this.sideB = y;
        this.sideC = z;
        count++;
    }

    public triangle(triangle other) {
        this.sideA = other.sideA;
        this.sideB = other.sideB;
        this.sideC = other.sideC;
        count++;

    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;

    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    public double perimeter() {
        return sideA + sideB + sideC;
    }

    public static int count() {
        return count;
    }

    public boolean isRightaAngled() {
        double a = sideA;
        double b = sideB;
        double c = sideC;
        double hypotenuse ,side1,side2;
        if(a>=b&&a>=c){
            hypotenuse=a;
            side1=b;
            side2=c;
        }else if(b>=a&&b>=c){
            hypotenuse=b;
            side1=a;
            side2=c;
        }
        else{
            hypotenuse=c;
            side1=a;
            side2=b;
        }
        return Math.abs(side1*side1+side2*side2)-hypotenuse*hypotenuse<0.001;
    }

    @Override
    public String toString() {
        return ("SideA = "+sideA+"SideB = "+sideB+"SideC = "+sideC);
    }
}





