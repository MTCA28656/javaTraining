class Book1 
{
	String bname;
	int price;
	static Author1 au1;
	Book1(String n,int p,Author1 au1)
	{
		this.bname=n;
		this.price=p;
		this.au1=au1;
	}
	public static void main(String[] args) 
	{
		 Author1 au1=new  Author1("Jhons",56,"UK");
		Book1 b=new Book1("Advance Java",700,au1);
		System.out.println("Book name "+b.bname);
		System.out.println("Book price "+b.price);
		System.out.println("-------------Author Details-------------");
		System.out.println("Author name "+b.au1.aname);
		System.out.println("Author's age "+b.au1.age);
		System.out.println("Author's placee "+b.au1.place);
	}
}
