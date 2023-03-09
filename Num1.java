import java.util.Scanner;
class Num1 
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
	public int addDigits()
	{
		int n=this.num;
		int sum=0;
		while(n>0)
		{
			sum=sum+(n%10);
			n=n/10;
		}
		return sum;


	}//addDigits()
}//Num
