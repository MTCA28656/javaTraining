class Employee 
{
	static  float sal=40000;
}
class Programmer extends Employee
{
	static int bonus=1000;
	public static void main(String[] args) 
	{
		Programmer p=new Programmer();

		System.out.println("Programmers salary: "+sal);
		System.out.println("Programmers bonus: "+bonus);
	}
}
