package Point;

public class Main {
    public static void main(String []args){
        point p1=new point(2,3);
        point p2=new point(4,5);
        System.out.println("Point distance:"+p1.distance(p2));

        Line line=new Line(p1,p2);

        System.out.println(line);
        System.out.println("Length of line: "+line.length());

        p1.setX(10);
        System.out.println(line);;
    }
}
