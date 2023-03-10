class Car2
{
	 int speed=10;
	
		final	void run()
		{
			 System.out.println("Running");
		}
}
class Swift extends Car2
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
