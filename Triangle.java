import java.util.Scanner;
class  Triangle
{
	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
    System.out.print("Enter the co-ordinates of point P: ");
	double x1=sc.nextDouble();
	double y1=sc.nextDouble();
	System.out.print("Enter the co-ordinates of point Q: ");
	double x2=sc.nextDouble();
	double y2=sc.nextDouble();
	System.out.print("Enter the co-ordinates of point R: ");
	double x3=sc.nextDouble();
	double y3=sc.nextDouble();
	Point p=new Point(x1,y1);
	Point q=new Point(x2,y2);
	Point r=new Point(x3,y3);
	double a=p.distance_from_Point(q);
	double b=p.distance_from_Point(r);                         
	double c=r.distance_from_Point(q);
	
		System.out.println("Length of pq= "+a);
		System.out.println("Length of pr= "+b);
		System.out.println("Length of rq= "+c);
		double peri=a+b+c;
		double s=peri/2;
		double area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("Area of the triangle formed by points P,Q and R is: "+area);
	}
}
