class Counter1 
{
  int count=0;
	Counter1()
	{
		count++;
		System.out.println(count);
	}
	public static void main(String[] args) 
	{
		Counter c1=new Counter();
		Counter c2=new Counter();
		Counter c3=new Counter();
	}
}
