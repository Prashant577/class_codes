
public class Fibonacci_recursion {

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
		int fibn1=fibo(n-1);
		int fibn2=fibo(n-2);
		int curfib=fibn1+fibn2;
		return curfib;
	}

}
