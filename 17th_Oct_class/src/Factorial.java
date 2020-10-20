
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(factorial(5));
	}
	public static int factorial(int n)
	{
		if(n==1)
		{
			return 1;
		}
		int f=factorial(n-1);
		int f2=f*n;
		return f2;
	}

}
