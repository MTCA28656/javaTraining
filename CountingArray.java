import java.util.Scanner;
class CountingArray
{
	public static void main(String[] args) 
	{
		
		int below18=0;
		int in18And60=0;
		int above60=0;
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
			if(arr[j]<18)
			{
				below18=below18+1;
			}
			else if(arr[j]>=18 &&arr[j]<59)
			{
				in18And60=in18And60+1;
			}
			else
			{
				above60=above60+1;
			}
		}
		System.out.println("Below 18 numbers: "+below18);
		System.out.println("Between 18 and 60 numbers: "+in18And60);
		System.out.println("Above 60 numbers: "+above60);

		
	}
}
