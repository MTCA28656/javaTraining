import java.util.Scanner;
class Program312
{
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the value for a ");
		int a=sc.nextInt();
		System.out.print("Enter the value for b ");
		int b=sc.nextInt();
		System.out.print("Enter the value for c ");
		int c=sc.nextInt();
		if(a>b &&a>c)
		System.out.print("The largest is: "+a);
		else if(b>a &&b>c)
		System.out.print("The largest is: "+b);
		else if(c>a &&c>b)
		System.out.print("The largest is: "+c);
	}
}