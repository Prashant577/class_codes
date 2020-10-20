
public class Power1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(powerNew(5,7));
	}
	public static int powerNew(int n, int pow)
	{
		if(pow==0)
		{
			return 1;
		}
		if(pow==1)
		{
			return n;
		}
		
		
		int a=powerNew(n,pow/2);
		
		if(pow%2==0)
		{
		int	sum=a*a;
		return sum;
		}
		else
		{
		int	sum=n*a*a;
		return sum;
		}
		
		
	}

}
