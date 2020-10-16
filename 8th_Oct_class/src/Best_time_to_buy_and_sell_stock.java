import java.util.Scanner;

public class Best_time_to_buy_and_sell_stock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int profit=0;
		int minprice=Integer.MAX_VALUE;
		for(int i=0;i<n;i++)
		{
			if(a[i]<minprice)
			{
				minprice=a[i];
			}
			else if(a[i]-minprice>profit)
			{
				profit=a[i]-minprice;
			}
		}
		System.out.println(profit);
	}

}
