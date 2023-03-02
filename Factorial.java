import java.util.Scanner;
class Fact
{
	private   int x;
	public  void set(int x)
	{
      this.x=x;
	
	}//set()
	public  int get()
	{
		return x;
	}//get()
		
	
	public long fact(int x)
	{
		int res=1;
		x=this.x;
			while(x>=0)
		{
			if(x==0)
			return res*1;
		    else
		 {
			res=res*x;
		    x--;
		}//else
		}//while
		return res;
	}//fact()
	  public int product(int x)
	{
		  x=this.x;
		int p=1;
		while(x>0)
		{
			p=p*(x%10);
			x=x/10;
			
		}//while
		return p;
	}//product()
	
}
class Factorial
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
	System.out.print("Enter the number: ");
	int n=sc.nextInt();
	Fact f=new Fact();
	f.set(n);
	f.get();
	System.out.println("Product of the digits of number "+n+ " is: "+f.product(n));
	
	
	if(n<0)
			System.out.println("Factorial of the negative number is : INVALID");
	else
	
		System.out.println("Factorial of the number "+n+ " is: "+f.fact(n));
		
		
	}
}
