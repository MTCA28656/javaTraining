import java.util.Scanner;
class Program312a
{
	static int large(int a,int b,int c)
	{
		if(a>b &&a>c)
			return a;
		else if(b>a &&b>c)
			return b;
		else if(c>a &&c>b)
			return c;
		return 0;
	}


	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the value for a ");
		int a=sc.nextInt();
		System.out.print("Enter the value for b ");
		int b=sc.nextInt();
		System.out.print("Enter the value for c ");
		int c=sc.nextInt();
		
		System.out.print("The largest among three is: "+large(a,b,c));
		
		
	}
}