class Exp1 
{
	int x,y,z;
	public void add(int a,int b)
	{
		  x=a+b;
		  y=x+b;
		  z=a+=b--;
		 

	}//add()

	public static void main(String[] args) 
	{
		Exp1 e=new Exp1();
		Exp1 e1=new Exp1();
		int a=2;
		e.add(a,(a+1));
		e1.add(5,a);
		System.out.println(e1.x+" "+e1.y+" "+e.z);
	}
}
