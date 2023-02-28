class Abcd
{
	static int add(int a,int b)
	{
		System.out.println( a+b);
		return 0;

	}//add
	public int sub(int a,int b)
	{
		System.out.println( a-b);
		return 0;
	}//sub
	public int mul(int a,int b)
	{
		System.out.println( a*b);
		return 0;
	}//mul
	static int div(int a,int b)
	{
      System.out.println (a/b);
	  return 0;
	}//div
	public static void main(String args[])
	{
		Abcd a=new Abcd();
		add(10,20);
		a.sub(3,7);
		a.mul(12,98);
		div(9,8);

	}//main
}//Abc