import java.util.Scanner;
class Cube
{
	static int calulate(int x)
	{
		return x*x*x;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int res=calulate(n);
		System.out.println(res);
	}
}