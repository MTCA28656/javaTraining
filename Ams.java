 class Ams
{
    public static void main(String[] args) 
     {
        int num, count = 0, a, b, c, sum = 0;
		
        System.out.print("Armstrong numbers from 100 to 15000:");
        for(int i = 100; i <= 15000; i++)
        {
            num= i;
			int numberOfdigits=String.valueOf(num).length();
            while(num> 0)
            {
               int digit=num%10; 
			sum+=Math.pow(digit,numberOfdigits);
			num=num/10; 
            }
            if(sum == i)
            {
                System.out.print(i+" ");
            }
            sum = 0;
        }
	 }
}