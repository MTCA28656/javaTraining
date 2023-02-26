import java.util.*;
class If_exp1
{
	public static void main(String args[])
	{
		int i,j,k,min;
		Scanner sc=new Scanner(System.in);
		i=sc.nextInt(); j=sc.nextInt(); k=sc.nextInt();
		if(i<j)
		{
			if(i<k) min=i;
			
		    else min=k;
		}
		else
		{
			if(j<k) min=j;
			
		    else min=k;
		}
			System.out.println("min of "+i+" "+j+" "+k+" is"+min);
	}
}