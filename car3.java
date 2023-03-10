final class Car3
{
	 int speed=10;
	
			void run()
		{
			 System.out.println("Running");
		}
}
class Swift extends Car3
{
void run()
	{
	System.out.println("Running safely");
	}

	public static void main(String[] args) 
	{
		Car2 r=new Car2();
			
		r.run();
	}
}
