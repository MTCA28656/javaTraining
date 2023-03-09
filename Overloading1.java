class Adder 
{
	static int sum(int a,int b)
	{
		return (a+b);
	}
	static double sum(double a,double b)
	{
		return (a+b);
	}
}
class Overloading1
{
	public static void main(String[] args) 
	{
		System.out.println(Adder.sum(10,20));
		System.out.println(Adder.sum(10.54,20.4));
	}
}
