import java.util.Scanner;
class Number1
{
	private int num[]=new int[n];
	
	public boolean checkPrime()
	{
		//num[n]=this.num[n];
		if(num[]==1 || num[]==2)
			return true;
		for(int k=2;k<num.length;k++)
		{
			if(num[]%k==0)
				return false;
		}
		return true;
		
	}//checkPrime()
} //Num
class CheckPrimeArray
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size: ");
		int n=sc.nextInt();
		int prime[]=new int[n];
		int temp[]=new int[n];
		for(int i=0;i<temp.length;i++)
		{
			temp[i]=sc.nextInt();
		}
		Num n1=new Num();
		n1.setNum(temp[n]);
		for(int j=0;j<temp.length;j++)
		{
		if(n1.checkPrime())
		System.out.println(prime[j]);
		}
		
	}
}
