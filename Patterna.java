import java.util.*;
class Patterna
{
public static void printpatternRow(char ch,int nc)
{
for(int i=0;i<=nc;i++)
{
 System.out.print(ch);
}
System.out.print("\n");
}
public static void printpatterninc(int nc,char ch)
{
for(int j=0;j<=nc;j++)
{printpatternRow(ch ,j);
}
}
public static void printpatterndec(int nc,char ch)
{
for(int j=nc;j>=0;j--)
{printpatternRow(ch ,j);
}
}
public static void main(String []args)
{
	Scanner sc=new Scanner(System.in);
	
int n=sc.nextInt();
char c=sc.next().charAt(0);
if(n%2==0){
printpatterninc( n/2, c);
printpatterndec( n/2, c);
}
else
{
printpatterninc( n/2, c);
printpatterndec( (n+1)/2, c);
}
}
}