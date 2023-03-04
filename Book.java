class Book 
{
	String name;
	int price;
	Author au;
Book(String n,int p,Author au)
	{
	this.name=n;
	this.price=p;
	this.au=au;
	}
	public static void main(String[] args) 
	{
		Author au=new Author("Jhon",42,"USA");
		Book b=new Book("Java for Begginers",800,au);
		System.out.println("Book Name: "+b.name);
		System.out.println("Book Price: "+b.price);
		System.out.println("------------Author Details-------------");
		System.out.println("Author Name: "+b.au.authorName);
		System.out.println("Author Age: "+b.au.age);
		System.out.println("Author Place: "+b.au.place);

	}
}
