import java.util.Scanner;

public class Running_sum_of_1D_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int sum[]=new int[n];
		sum[0]=a[0];
		for(int i=1;i<n;i++)
		{
			sum[i]=sum[i-1]+a[i];
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(sum[i]+" ");
		}
	}

}
