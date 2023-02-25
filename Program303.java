import java.util.*;
class Program303
{
static boolean isEven(int n)
{
boolean even_no=true;
for(int i=1;i<=n;i++)
even_no= !even_no;
return(even_no);
}
public static void main(String args[])
{
int a;
Scanner sc=new Scanner(System.in);
System.out.print("Enter a value: ");
a=sc.nextInt();
if(isEven(a))
{
System.out.println("even");
}
else 
{
System.out.println("odd");
}
}
}

