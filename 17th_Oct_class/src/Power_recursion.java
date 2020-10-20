
public class Power_recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(power(2,5));
	}
	public static int power(int n,int pow)
	{
		if(pow==0)
		{
			return 1;
		}
		else
		{
			return n*power(n,pow-1);
		}
		
	}

}
