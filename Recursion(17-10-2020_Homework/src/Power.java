
public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(power(5,7));
	}
	public static int power(int n, int pow)
	{
		if(pow==0)
		{
			return 0;
		}
		if(pow==1)
		{
			return n;
		}
		int a=power(n,pow-1);
		int sum=n*a;
		return sum;
	}

}
