class Bank
{
public int getRatio(){
return 0;
}
}
class SBI extends Bank
{
public int getRatio(){
return 8;
}
}
class ICICI extends Bank
{
public int getRatio(){
return 7;
}
}
class Axis extends Bank
{
public int getRatio(){
return 9;
}}
class TestBank
{
public static void main(String[] args)
{
SBI s=new SBI();
ICICI i=new ICICI();
Axis a=new Axis();
System.out.println("SBI Rate of Interest is "+s.getRatio());
System.out.println("ICICI Rate of Interest is "+i.getRatio());
System.out.println("Axis Rate of Interest is "+a.getRatio());
}
}