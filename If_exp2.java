import java.util.*;
class If_exp2
{
	public static void main(String args[])
	{
		int i,j,k,min=0;
		Scanner sc=new Scanner(System.in);
		i=sc.nextInt(); j=sc.nextInt(); k=sc.nextInt();
		if(i<j && i<k)  min=i;
		if(j<i && j<k)  min=j;
		if(j<k && k<j) min=k;
		System.out.println("min of "+i+" "+j+" "+k+" is "+min);
	}
}