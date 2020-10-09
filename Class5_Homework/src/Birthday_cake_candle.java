import java.util.Scanner;

public class Birthday_cake_candle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int count=0;
		int max;
		for(int i=0;i<n;i++)
			{
			a[i]=sc.nextInt();
			
		}
		max=a[0];
		for(int i=1;i<n;i++)
		{
			if(a[i]>max)
			{
				count++;
			}
		}
		System.out.println(count);
	}

}
