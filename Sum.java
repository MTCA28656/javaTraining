import java.util.Scanner;
class Sum 
{
	public int SumDigits(int n)
	{
		int sum=1;
		for(int i=0;i<=0;i++)
		{
			sum=sum+n%10;
			n=n/10;
		}
		return sum;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println("Enter the number for which u want to add the digits: ");
		Sum s=new Sum();
		System.out.println(s.SumDigits(num));
		
	}
}
