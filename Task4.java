import java.util.Scanner;
class Task4
{
	static double area(double length,double breadth)
	{
		return length*breadth;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the length ");
		double length=sc.nextDouble();
		System.out.print("Enter the breadth ");
		double breadth=sc.nextDouble();
		System.out.print("The parameter of the reactangle is: "+area(length,breadth));
	}
}