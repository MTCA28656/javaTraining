import java.util.Scanner;
class CubeArray


{
	public static void main(String[] args) 
	{
		
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size: ");
		int n=sc.nextInt();
		
		int[] arr=new int[n];
		int cube[]=new int[n];
		System.out.println("Enter array elements: ");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int j=0;j<arr.length;j++)
		{
			cube[j]=arr[j]*arr[j]*arr[j];
			System.out.print(" "+cube[j]);
			
		}
		
		

		
	}
}
