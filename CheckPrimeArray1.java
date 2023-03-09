import java.util.Scanner;
class Num 
{
	private int num;
	public void setNum(int num)
	{
		this.num=num;
	}
	public int getNum()
	{
		return this.num;
	}
	public boolean checkPrime()
	{
		if(this.num==1 || this.num==2)
			return true;
		for(int i=2;i<this.num;i++)
		{
			if(this.num%i==0)
				return false;
		}
		return true;
	}
}//Num
class CheckPrimeArray1
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int count=0;
		System.out.println("enter a number: ");
		int size=sc.nextInt();
		int arr[]=new int[size];
		int prime[]=new int[size];
		System.out.println("Enter "+size+" no's");
		for (int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}//for
		Num obj=new Num();
		for(int i=0;i<size;i++)
		{
		obj.setNum(arr[i]);
		if(obj.checkPrime())
			{
		System.out.println("Prime "+obj.getNum());
		prime[i]=obj.getNum();
		count++;
			}
			else
			{
				prime[i]=0;
			}
		}//for
		for(int i=0;i<size;i++)
		{
		if(prime[i]!=0)
		{
			System.out.print(" "+prime[i]);
		}
		
		}
		System.out.print("\n Total prime numbers in input array is: "+count);

	

	}
}
