class Person 
{
	int id;
	String name;
	Person(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
}
class Emp extends Person
{
	float sal;
	Emp(int id,String name,float sal)
	{
		super(id,name);
		this.sal=sal;
	}
	void display()
	{
		System.out.println(id+" "+name+" "+sal);
	}
}
class TestSuper4
{
	public static void main(String[] args) 
	{
		Emp e=new Emp(1,"Gowthami",45000f);
		e.display();
	}
}
