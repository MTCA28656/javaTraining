import java.util.*;
class Program304
{

public static void main(String args[])
{
int a,b,temp;
Scanner sc=new Scanner(System.in);
System.out.print("Enter a value: ");
a=sc.nextInt();
System.out.print("Enter b value: ");
b=sc.nextInt();
temp=a;
a=b;
b=temp;
System.out.print("Numbers after swapping a :" +a+ ", b : " +b);

}
}

