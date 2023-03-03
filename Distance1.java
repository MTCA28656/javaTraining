import java.util.Scanner;
class Distance1
{
   public static void main(String[] args) 
	{
	   Scanner sc=new Scanner(System.in);
	    System.out.print("Enter the x coordinates and y coordinates Point P: ");
	   double a=sc.nextDouble();
	   double b=sc.nextDouble();
       
		Point p=new Point(a,b);
		System.out.print("Enter the x1 coordinates and y1 coordinates for Point Q: ");
	   double a1=sc.nextDouble();
	   double b1=sc.nextDouble();
       Point Q=new Point(a1,b1);
		double res=p.distance_from_origin();
		double res1=p.distance_from_Point(Q);
		System.out.println("Distance of a Point P form a origin is: "+res);
		System.out.println("Distance from Point P to Point Q is: "+res1);
		 System.out.println("Co orfinates of the point p before transision: "+p.getX()+" ,"+p.getY());
		System.out.println("Enter the x and y coordinates for translation of the point: ");
		double a3=sc.nextInt();
		double b3=sc.nextInt();
	    p.translate(a3,b3);
		 System.out.print("Co ordinates of the point "+p.getX()+", "+ p.getY());
	}//Main()
}//Distance
