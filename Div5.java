import java.util.Scanner;
class Div5


{
	public static void main(String[] args) 
	{
		
		
		int div5=0;
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
			if(arr[j]%5==0)
			{
				div5=div5+1;
			}
			
		}
		System.out.println("divisible by 5 numbers: "+div5);
		

		
	}
}
