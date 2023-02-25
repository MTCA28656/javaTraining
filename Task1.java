import java.util.*;
class Task1 
{
	public static void main(String[] args) 
	{
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter vlaue for a: ");
		a=sc.nextInt();
		System.out.println("Enter vlaue for b: ");
		b=sc.nextInt();
		
		System.out.println(a+"-"+b+"="+(a-b));
		System.out.println(a+"*"+b+"="+(a*b));
		 
		  if(a<b)
		{
			  System.out.println("a is smallar");
		}
		else if(a>b)
		{
			System.out.println("a is greater");
		}
		 if(b<a)
		{
			System.out.println("b is smallar");
		}
		else if(b>a)
		{
			System.out.println("b is grater");
		}
		else
		{
			System.out.println("both a and b are equal");
		}
	
			
		

	}
}
