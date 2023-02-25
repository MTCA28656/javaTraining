import java.util.*;
class Program301
{
static int isEven(int n)
{
return(n & 1);
}
public static void main(String args[])
{
int a;
Scanner sc=new Scanner(System.in);
System.out.print("Enter a value: ");
a=sc.nextInt();
if(isEven(a)==0)
{
System.out.println("even");
}
else 
{
System.out.println("odd");
}
}
}

