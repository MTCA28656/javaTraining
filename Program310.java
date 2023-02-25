import java.util.Scanner;
class Program310
{
public static void main(String args[])
{
int day_no;
Scanner sc=new Scanner(System.in);
System.out.print("Enter day number: ");
day_no=sc.nextInt();
String s=new String();
if(day_no==0) s="Sunday";
if(day_no==1) s="Monday";
if(day_no==2) s="Tuesday";
if(day_no==3) s="Wednesday";
if(day_no==4) s="Thursday";
if(day_no==5) s="Friday";
if(day_no==6) s="Saturday";
if(day_no<0 ||day_no>6) s="invalid";
System.out.println("The days is :"+s);
}
} 
