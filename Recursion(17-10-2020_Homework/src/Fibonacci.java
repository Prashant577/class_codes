
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fibo(5));
	}
	public static int fibo(int n)
	{
		if(n==1)
		{
			return 0;
		}
		if(n==2)
		{
			return 1;
		}
		int a=fibo(n-1);
		int b=fibo(n-2);
		int csum=a+b;
		return csum;
	}

}
