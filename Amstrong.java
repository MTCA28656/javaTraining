import java.util.Scanner;
class Amstrong
{
	private int n;
	private int count=0;
	private int pow=0;
	public void setNum(int n)
	{
		this.n=n;
		
	}//srtNum()
	public int getNum()
	{
		return this.n;
	}//getNum()
	

	public boolean ams()
	{
		int n1=this.n;
		System.out.println(n1);
		int sum=0;
		 int numberOfdigits=String.valueOf(n).length();
		while(n>0)
		{
			int digit=n%10;
			sum+=Math.pow(digit,numberOfdigits);
			n=n/10;
   

		}//while
		
		if(sum==n1)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}//ams()

	public int countDigits()
	{
		//System.out.println(this.n);
		while(n>0)
		{
			n=n/10;
			count++;
		}
		System.out.println(count);
		return count;
		
	}//countDigits()
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the digit: ");
		
		 int size=sc.nextInt();
		int arr[]=new int[size];
		int ams[]=new int[size];
		System.out.println("Enter "+size+" no's");
		for (int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}//for
		Amstrong obj=new Amstrong();
		for(int i=0;i<size;i++)
		{
		obj.setNum(arr[i]);
	
		obj.setNum(size);
		
		if(obj.ams())
			{
			  ams[i]=obj.getNum();
			System.out.print(ams[i]);
		}
		
		}
		
	}
		
}
