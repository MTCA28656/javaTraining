class Adder 
{
	static int sum(int a,int b)
	{
		return (a+b);
	}
	static int sum(int a,int b,int c)
	{
		return (a+b+c);
	}
}
class Overloading
{
	public static void main(String[] args) 
	{
		System.out.println(Adder.sum(10,20));
		System.out.println(Adder.sum(10,20,39));
	}
}
