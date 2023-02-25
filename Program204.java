import java.util.*;
class Program204
{
	public static void main(String args[])
	{
		char ch;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a charetcter: ");
		ch=sc.next().charAt(0);
		if((ch>='a' && ch<='z')||(ch<='A' && ch>='Z'))
		{
			System.out.println(ch +" is a alphabet");
		}
		else
		{
			System.out.println(ch +" is not a alphabet");
		}
	}
}