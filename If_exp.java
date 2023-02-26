import java.util.*;
class If_exp
{
	public static void main(String args[])
	{
		int i,j;
		Scanner sc=new Scanner(System.in);
		i=sc.nextInt(); j=sc.nextInt();
		if(j==0)
			System.out.println("Division by zero");
		else
			System.out.println(i+"/"+j+"="+(i/j));
	}
}