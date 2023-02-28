class StaticMethod 
{
	static void myStaticMethod()
	{
		System.out.println("Static method can be called without creating object");
	}
	public void myMethod()
	{
		System.out.println("public methods can be called by creating objects");
	}
	public static void main(String[] args) 
	{
		myStaticMethod();
		//myMethod();
		StaticMethod s=new StaticMethod();
		s.myMethod();
	}
}
