import java.util.Scanner;
class Program310c
{
static void displayDay(int day_no)
{
String s=new String();
switch(day_no)
	{
case0: s="Sunday"; break;
case1: s="Monday"; break;
 case2:s="Tuesday"; break;
case3: s="Wednesday"; break;
case4: s="Thursday"; break;
case5: s="Friday"; break;
case6: s="Saturday"; break;
default: s="invalid"; break;
	}
System.out.println("The days is :"+s);
}
public static void main(String args[])
{
int day_no;
Scanner sc=new Scanner(System.in);
System.out.print("Enter day number: ");
day_no=sc.nextInt();
displayDay(day_no);

}
} 
