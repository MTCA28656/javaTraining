import java.util.Scanner;
class ForLoop2
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		for(int count=1;count<=n;count++)
		{
		  sum=sum+count;
		}
		System.out.println(sum);
	}
}
