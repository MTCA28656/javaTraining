class Animal
{
	public void eat()
	{
		System.out.println("eating...");
	}
}
class Dog extends Animal
{
	public void bark()
	{
		System.out.println("barking...");
	}
}
class Cat extends Animal
{
	public void meow()
	{
		System.out.println("meowing...");
	}
}
class Inheritance3
{
	public static void main(String args[])
	{
		Dog d=new Dog();
		d.bark();
		d.eat();
		Cat c=new Cat();
		c.meow();
		c.eat();
	}
}