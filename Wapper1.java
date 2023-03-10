class Wapper1 
{
	public static void main(String[] args) 
	{
		int a=10;
		Integer j=a;//autoBoxing
		Integer i=Integer.valueOf(a);//explicitly converting int to Integer
		System.out.println(a);
		System.out.println(j);
		System.out.println(i);
	}
}
