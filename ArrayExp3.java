import java.util.Scanner;
class ArrayExp3
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size: ");
		int n=sc.nextInt();
		
		int[] arr=new int[n];
		System.out.println("Enter array elements: ");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int sum=0;
		Double avg;
		for(int a:arr)
		{
			sum=sum+a;
		}
		avg=((double)sum/(double)arr.length);
		System.out.println("sum= "+sum);
		System.out.println("avg= "+avg);
	}
}
