import java.util.Scanner;
class DigitCount
{
	private int n;
	private int count=0;
	public void setNum(int n)
	{
		this.n=n;
		
	}//srtNum()
	public int getNum()
	{
		return this.n;
	}//getNum()
	public int countDigits()
	{
		
		while(n>0)
		{
			n=n/10;
			count++;
		}
		return count;
	}//countDigits()

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the digit: ");
		int a=sc.nextInt();
		DigitCount obj=new DigitCount();
		obj.setNum(a);
		System.out.println(obj.countDigits());
	}
		
}
