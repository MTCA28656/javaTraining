
class Overloading2
{
	
	public static void main(String[] args) 
	{
		System.out.println("Main method having String[]");
		public static void main(String args) 
	{
		System.out.println("Main method having String");
	}
	public static void main() 
	{
		System.out.println("Main method without args");
	}
	
	}
}
