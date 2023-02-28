class Outer 
{
	static int data=10;
	static class Inner
	{
		static void msg()
		{
		System.out.println("data is : "+data);
		}//msg()
	}//Inner

	public static void main(String[] args) 
	{
		//Outer.Inner o=new Outer.Inner();
		Outer.Inner.msg();
	}//main
}//Outer
