import java.util.Scanner;
class Palindrome 
{
	public String pal(String s)
	{
		String res=" ";
		for(int i=s.length()-1;i>=0;i--)
		{
			res=res+s.charAt(i);
		}
		return res;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String str=next();
		Palindrome  p= Palindrome();
		p.pal(str);
		if(res==str)
		{
		System.out.println(str+" is palindrome");
		}
		else
			System.out.println(str+" is not palindrome");
	}
}
