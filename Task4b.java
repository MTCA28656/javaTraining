import java.util.Scanner;
class Task4b
{
	static double area(double length)
	{
		return length*length;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the length ");
		double length=sc.nextDouble();
		
		System.out.print("The area of the reactangle is: "+area(length));
	}
}