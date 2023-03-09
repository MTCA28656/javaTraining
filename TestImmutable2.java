import java.util.Scanner;
class TestImmutable2
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String s1=sc.next();
		s=s.concat(s1);
		System.out.println(s);
	}
}
