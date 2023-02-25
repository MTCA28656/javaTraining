import java.util.Scanner;
class Task4a
{
	static double parameter(double length,double breadth)
	{
		return 2*length*breadth;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the length ");
		double length=sc.nextDouble();
		System.out.print("Enter the breadth ");
		double breadth=sc.nextDouble();
		System.out.print("The parameter of the reactangle is: "+parameter(length,breadth));
	}
}