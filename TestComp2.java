class TestComp2
{
	public static void main(String[] args) 
	{
		String s1="Sachin";
		String s2="Sachin";
		String s2=new String("Sachin");
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		
	}
}
