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
class CheckPrime
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int temp=sc.nextInt();
		Num n=new Num();
		n.setNum(temp);
		if(n.checkPrime())
		System.out.println("Prime");
		else
			System.out.println("Not Prime");

	}
}
