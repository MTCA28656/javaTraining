import java.util.Scanner;
class Program312c
{
	static int smaller(int a,int b,int c)
	{
		return (a<b &&a<c) ?a:(b<a &&b<c) ?b:(c<a &&c<b) ?c:a;
			
		
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
		
		System.out.print("The smallest among three is: "+smaller(a,b,c));
		
		
	}
}