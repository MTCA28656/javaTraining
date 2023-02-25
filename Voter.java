import java.util.*;
class  Voter
{
	public static void main(String[] args) 
	{
		int age;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your age: ");
		age=sc.nextInt();
		if(age>=18)
		{
			System.out.println("your are eligible for vote");
		}
		else
		{
			System.out.println("your are  not eligible for vote");
		if(18-age==1)
		{
			System.out.println("your are eligible for vote after one year");
		}
		else
			System.out.println("your are eligible for vote after "+(18-age)+ " years");
		}
	}
}
