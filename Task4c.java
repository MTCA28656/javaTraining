import java.util.Scanner;
class Task4c
{
	static double parameter(double length)
	{
		return 4*length;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the length ");
		double length=sc.nextDouble();
		
		System.out.print("The parameter of the reactangle is: "+parameter(length));
	}
}