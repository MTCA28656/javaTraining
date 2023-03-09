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
class AddDigitsArray
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number: ");
		int size=sc.nextInt();
		int arr[]=new int[size];
		int sum[]=new int[size];
		System.out.println("Enter "+size+" no's");
		for (int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}//for
		Num1 obj=new Num1();
		for(int i=0;i<size;i++)
		{
		obj.setNum(arr[i]);
		sum[i]=obj.addDigits();
		
		
		
		}//for
		for(int i=0;i<size;i++)
		{
			System.out.print(" "+sum[i]);
		}
		
	}
}
