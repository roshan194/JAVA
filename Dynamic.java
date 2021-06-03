package TestRK;
import java.util.Scanner;

abstract class ComputeArea {
    abstract void findTriangle(double b, double h);
    abstract void findRectangle(double l, double b);
    
}
 
class findArea extends ComputeArea {
 // @overriding
    void findTriangle(double b, double h)
    {
        double area = (b*h)/2;
        System.out.println("Area of Triangle: "+area);
    }
 // @overriding
    void findRectangle(double l, double b)
    {
        double area = l*b;
        System.out.println("Area of Rectangle: "+area);
    }
     
   
}
         
public class Dynamic
{
	public static void main(String[] args) 
	{
		
        double l, b, h, r, s;
        findArea area = new findArea();
        Scanner get = new Scanner(System.in);
 
        System.out.print("\nEnter Base & Vertical Height of Triangle: ");
        b = get.nextDouble();
        h = get.nextDouble();
        area.findTriangle(b, h);
 
        System.out.print("\nEnter Length & Breadth of Rectangle: ");
        l = get.nextDouble();
        b = get.nextDouble();
        area.findRectangle(l, b);
 
        
    }
}   
