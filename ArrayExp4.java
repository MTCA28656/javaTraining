import java.util.Scanner;
class ArrayExp4
{
	public static void main(String[] args) 
	{
		int flage=0;
		int x;
		int i=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size: ");
		int n=sc.nextInt();
		
		int[] arr=new int[n];
		System.out.println("Enter array elements: ");
		for( i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}

		System.out.println("Enter array element you want to find: ");

		x=sc.nextInt();
		for(i=0;i<n;i++)
		{
			if(arr[i]==x)
			{
				flage=1;
				break;
			}
			else
			{
				flage=0;
			}
		}
		if(flage==1)
		{
		System.out.println("Element found at position "+(i+1));
		}
		else
		System.out.println("Element not found ");
	}
}
