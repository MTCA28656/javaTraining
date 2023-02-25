import java.util.*;
class  Program205
{
	public static void main(String[] args) 
	{
	char ch;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter a chater: ");
	ch=sc.next().charAt(0);
	int ascii =(int) ch;
    System.out.println("ASCII value of "+ch+" is "+ascii);
	}
}
