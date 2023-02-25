import java.util.Scanner;
class Program311a
{
	static double area(double radius)
	{
		return 2* Math.PI*radius;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the radius ");
		double radius=sc.nextDouble();
		System.out.print("The parameter of the circle is: "+area(radius));
	}
}