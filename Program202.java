import java.util.*;
class Program202
{
static boolean isEven(int n)
{
return((n/2)*2==n);
}
public static void main(String args[])
{
int n;
Scanner sc=new Scanner(System.in);
System.out.print("Enter a number: ");
n=sc.nextInt();
if(isEven(n))
{
System.out.println(n+ " is even");
}
else
{
System.out.println(n+ " is odd");
}
}
}