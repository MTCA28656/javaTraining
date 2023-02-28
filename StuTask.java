import java.util.Scanner;
class Student 
{
	int rollno;
	String name;
	static String college="MTCA";
	Student(int r,String n)
	{
		rollno=r;
		name=n;
	}
	void display()
	{
		System.out.println("Rollno: "+rollno+" Name: "+name+" College: "+college);
		
	}
}
class StuTask
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int rollno=sc.nextInt();
		String name=sc.next();
		
		Student s1=new Student(rollno,name);
		int rollno1=sc.nextInt();
		String name1=sc.next();
		System.out.println(" ");
		Student s2=new Student(rollno1,name1);
		int rollno2=sc.nextInt();
		String name2=sc.next();
		Student s3=new Student(rollno2,name2);
		//Student.college="MITS";
		s1.display();
		s2.display();
		s3.display();
	}
}
