import java.util.*;
class Program308
{

public static void main(String args[])
{
int a,b;
Scanner sc=new Scanner(System.in);
System.out.print("Enter a value: ");
a=sc.nextInt();
System.out.print("Enter b value: ");
b=sc.nextInt();
a=a*b;
b=a/b;
a=a/b;
System.out.print("Numbers after swapping a :" +a+ ", b : " +b);

}
}

