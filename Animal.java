class Animal
{
	public void eat()
	{
		System.out.println("eating...");
	}
}
class Dog
{
	public void bark()
	{
		System.out.println("barking...");
	}
}
class Inheritance
{
	pulbic static void main(String args[])
	{
		Dog d=new Dog();
		d.bark();
		d.eat();
	}
}