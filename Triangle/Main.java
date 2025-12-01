package Triangle;

public class Main {
  public static void main(String[]args){
      triangle t1=new triangle();
      triangle t2=new triangle(2);
      triangle t3=new triangle(3,4);
      triangle t4=new triangle(2,4,6);
      triangle t5=new triangle(t4);
      System.out.println(t1);
      System.out.println("perimeter: "+t1.perimeter());
      System.out.println("Right Angle Triangle: "+t1.isRightaAngled());

      System.out.println(t2);
      System.out.println("perimeter: "+t2.perimeter());
      System.out.println("Right Angle Triangle: "+t2.isRightaAngled());

      System.out.println(t3);
      System.out.println("perimeter: "+t3.perimeter());
      System.out.println("Right Angle Triangle: "+t3.isRightaAngled());

      System.out.println(t4);
      System.out.println("perimeter: "+t4.perimeter());
      System.out.println("Right Angle Triangle: "+t4.isRightaAngled());

      System.out.println("Total object craeted: "+triangle.count());
  }
}
