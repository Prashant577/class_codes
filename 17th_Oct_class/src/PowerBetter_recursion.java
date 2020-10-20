
public class PowerBetter_recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(btrpow(2,5));
	}
	public static int btrpow(int n, int pow)
	{
		if(pow==0)
		{
			return 1;
		}
		if(pow==1)
		{
			return n;
		}
		if(pow%2==0)
		{
			int powby2=btrpow(n,pow/2);
			return powby2*powby2;
		}
		else
		{
			int powby2=btrpow(n,pow/2);
			return powby2*powby2*n;
		}
	}

}
