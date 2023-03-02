import java.util.Scanner;
class Patteren4
{
	public static void print_patteren(int nc,char ch)
	{
		for(int i=0;i<nc;i++)
	
		{
			System.out.print(ch);
		}
		System.out.print("\n");
	}
		static void printcol(int nr,char ch)
		{
			for (int i=nr;i>0 ;i-- )
			{
				print_patteren(i,ch);
			
		    }
		
	     }


	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the charecter for the patten: ");
		char ch=sc.next().charAt(0);
		System.out.print("Enter no.of rows: ");
		int n=sc.nextInt();
		
		 printcol(n,ch);
		 
	}
}
