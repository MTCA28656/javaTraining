import java.util.Scanner;
class Pro
{

    static int product(int a)
	{
		int p=1;
		while(a>0)
		{
			p=p*(a%10);
			a=a/10;
			
		}//while
		return p;
	}//product()
}
class Product
	
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
	System.out.print("Enter the number: ");
	int n=sc.nextInt();
	
	System.out.println("Product of the digits of number "+n+ " is: "+Pro.product(n));
	}
}