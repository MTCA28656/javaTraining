import java.util.Scanner;
class Distance3
{
   public static void main(String[] args) 
	{
	   Scanner sc=new Scanner(System.in);
	   
       
		
		 System.out.print("Enter the x coordinates and y coordinates Point P: ");
	   double a2=sc.nextDouble();
	   double b2=sc.nextDouble();
	   Point p=new Point(a2,b2);
        System.out.println("Co orfinates of the point p before transision: "+p.getX()+" ,"+p.getY());
		System.out.println("Enter the x and y coordinates for translation of the point: ");
		double a3=sc.nextInt();
		double b3=sc.nextInt();
	    p.translate(a3,b3);
		 System.out.print("Co ordinates of the point "+p.getX()+", "+ p.getY());

	}//Main()
}//Distance
