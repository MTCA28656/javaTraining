class Exception3 
{
	public static void main(String[] args) 
	{
		try
		{
			int a[]=new int[5];
			 a[5]=10/0;
		}
		catch (ArithmeticException e)
		{
			System.out.println("Divisible by 0");
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException occures");
		}
		catch (Exception e)
		{
			System.out.println("Parent Exception ouccers");
		}
		System.out.println("Hello World!");
	}
}
