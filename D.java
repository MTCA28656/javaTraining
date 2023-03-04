class C 
{
	void dispC()
	{
		System.out.println("method of class C");
	}
}
class A extends C
{
	void dispA()
	{
		System.out.println("method of class A");
	}
}
class B extends A
{
	void dispB()
	{
		System.out.println("method of class B");
	}
}
class D extends A
{
	void dispD()
	{
		System.out.println("method of class D");
	}
   public static void main(String[] args) 
	{
		D d=new D();
		d.dispD();
		d.dispA();
		d.dispC();
	}
}
