import java.util.Scanner;
class ArrayExample1
{
	public static void main(String[] args) 
	{
		
		int sumEven=0;
		int sumOdd=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size: ");
		int n=sc.nextInt();
		
		int[] arr=new int[n];
		System.out.println("Enter array elements: ");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int j=0;j<arr.length;j++)
		{
			if(arr[j]%2==0)
			{
				sumEven=sumEven+arr[j];
			}
			else
			{
				sumOdd=sumOdd+arr[j];
			}
		}
		System.out.println("Sum of Even numbers: "+sumEven);
		System.out.println("Sum of Odd numbers: "+sumOdd);

		
	}
}
