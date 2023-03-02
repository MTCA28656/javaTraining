import java.util.Scanner;
class Sum
{
	private int n;
	public int setnum(int n)
	{
		this.n=n;
		return 0;
	}//setnumn
	public int getnum()
	{
		return n;
	}//getnum
	public int sumnum()
	{
		 int sum=0;
		while(n>0)
		{
		sum=sum+n%10;
		n=n/10;
		}//while
		return sum;
	}//sumnum

}//Sum
class  SumDigits
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int x=sc.nextInt();
		Sum s=new Sum();
		s.setnum(x);
		System.out.println("The sum of the digits of the number "+s.getnum()+" is "+s.sumnum());
	}//main()
}//SumDigits
