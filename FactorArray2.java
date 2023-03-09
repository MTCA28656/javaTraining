import java.util.Scanner;
class FactorArray2
{
	public static void main(String[] args) 
	{
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		num=sc.nextInt();
		int size=(int)num/2;
		int[] fa=new int[size];
		int i,count=0;
		for(i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				fa[count]=i;
				count=count+1;
				System.out.print(i+" ");
				
			}
		}
		System.out.print("\n Total number of factors of "+num+": "+count);
		System.out.println(" ");
		for(int j=0;j<count-1;j++)
		{
			System.out.print(fa[j]+" ");
		}
	}
}
