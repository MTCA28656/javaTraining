import java.util.*;
class Task2
{
static int diff(int a,int b)
{
return a-b;
}
static int product(int a,int b)
{
return a*b;
}
static int smaller(int a,int b)
{
if(a<b)
return a;
if(b<a)
return b;
return 0;

}
static int  larger(int a,int b)
{
if(a>b)
return a;
if(b>a)
return b;
return 0;

}
public static void main(String args[])
{
int n1,n2,c;
Scanner sc=new Scanner(System.in);
System.out.print("Enter 1st number: ");
n1=sc.nextInt();
System.out.print("Enter 2nd number: ");
n2=sc.nextInt();
c=diff(n1,n2);
System.out.println("Diffrence is: "+c);
c=product(n1,n2);
System.out.println("Product is: "+c);
c=smaller(n1,n2);
System.out.println("Smaller is: "+c);
c=larger(n1,n2);
System.out.println("larger is: "+c);
}
}




