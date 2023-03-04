import java.util.Scanner;
class Res 
{
	public String reverse(String s)
	{//System.out.println("function called"+s.length()+"  s="+s);
		String r=" ";
		for(int i=s.length()-1;i>=0;i--)
		{//System.out.println("s.charAt(i)"+s.charAt(i));
			r=r+s.charAt(i);
			//System.out.println("r="+r);
		}
		return r;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String: ");
		String s1=sc.next();
		
		Res r=new Res();
		String res=r.reverse(s1);
		System.out.println("Revrse of the String "+s1+" is"+res);
		
	}
}
