
class Scope_exp
{
	public static void main(String[] args)
	{
		System.out.println("Example of Scope of variable");
		int i;
		i=15;
		System.out.println(i);
		{
			System.out.println("We are in a new block");
			int j;
			i=10;
			j=i*i;
			System.out.println("i and j in new block are "+i+" "+j);
		}
		System.out.println(i);
		int k;
		k=i+2;
		int j;
		j=k+100;
		System.out.println("k and j out of block new block are "+k+" "+j);
	}
}