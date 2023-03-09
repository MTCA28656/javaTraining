import java.util.Scanner;
class StudentArrayName
{
	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of students: ");
		int n=sc.nextInt();
		int rollno[]=new int[n];
		int s1[]=new int[n];
		int s2[]=new int[n];
		int s3[]=new int[n];
		String name[]=new String[n];
		double total[]=new double[n];
		double avg[]=new double[n];
		//loop
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter Student "+(i+1)+" details");
			
			System.out.print("Roll No: ");
			rollno[i]=sc.nextInt();
			System.out.println("Name: ");
			name[i]=sc.next();
			System.out.print("Subject1 marks: ");
			s1[i]=sc.nextInt();
			System.out.print("Subject2 marks: ");
			s2[i]=sc.nextInt();
			System.out.print("Subject3 marks: ");
			s3[i]=sc.nextInt();
			total[i]=(s1[i]+s2[i]+s3[i]);
			avg[i]=total[i]/3.0;

		}
		
		System.out.println("Name \t \t Roll No \t \t Total \t \t  Avarage");
		for(int i=0;i<n;i++)
		{
		System.out.println(rollno[i]+"\t \t"+name[i]+"\t \t \t"+total[i]+"\t \t"+avg[i]);
		
		}
	}
}
