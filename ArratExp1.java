class ArrayExp1
{
	public static void main(String[] args) 
	{
		int[] arr={12,5, 6,3,8};
		int sum=0;
		Double avg;
		for(int a:arr)
		{
			sum=sum+a;
		}
		avg=((double)sum/(double)arr.length);
		System.out.println("sum= "+sum);
		System.out.println("avg= "+avg);
	}
}
