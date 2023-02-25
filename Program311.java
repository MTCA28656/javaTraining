import java.util.Scanner;
class Program311
{
	static double area(double radius)
	{
		return Math.PI*radius*radius;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the radius ");
		double radius=sc.nextDouble();
		System.out.print("The area of the circle is: "+area(radius));
	}
}