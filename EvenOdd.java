import java.util.*;
class  EvenOdd
{
	public static boolean isEven(int n)
	{
		if(n%2==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void main(String[] args) 
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		n=sc.nextInt();
		if(isEven(n))
		{
			System.out.println("even");
		}
		else
		{
			System.out.println("odd");
		}
	}
}
