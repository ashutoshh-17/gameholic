import java.lang.Math.*;
abstract class shape {
             double area;
             abstract public void find_area();
}
class rectangle extends shape
{
            double width,height;
            rectangle(double width,double height) //parameterized constructor
          {
            super();
            this.width=width;
            this.height=height;
          }
            public void find_area() //method overridden
           {
             area=width*height;
             System.out.println("Area of rectangle: "+area);
           }
}
class triangle extends shape
{
           double s1,s2,s3;
           double s;
           triangle(double s1, double s2, double s3) //parameterized constructor
          {
             super();
             this.s1=s1;
             this.s2=s2;
             this.s3=s3;
          }
           public void find_area() //method overridden
         {
            s=0.5*(s1+s2+s3);
            area=Math.sqrt(s*(s-s1)*(s-s2)*(s-s3));
            System.out.println("Area of triangle: "+area);
         }
}
public class ShapeClass_4
{
      public static void main(String args[])
     {
          triangle t1=new triangle(12.5,10.2,5.3); //run time
          rectangle r1=new rectangle(15,30);
          t1.find_area();
          r1.find_area();
     }
}                 


/*
Output 
 Area of triangle: 26.348814015055783 
 Area of rectangle: 450.0 
*/