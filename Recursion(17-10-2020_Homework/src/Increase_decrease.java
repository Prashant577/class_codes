
public class Increase_decrease {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IncDec(5);
	}
	public static void IncDec(int n)
	{
		if(n==0)
		{
			return;
		}
		
		System.out.println(n);
		IncDec(n-1);
		System.out.println(n);
		
		
	}

}
