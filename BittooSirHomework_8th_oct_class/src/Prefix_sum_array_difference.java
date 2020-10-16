import java.util.Scanner;

public class Prefix_sum_array_difference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int a[]= {5,2,3,7,9,1,1,-2};
		int sum[]=new int[a.length];
		sum[0]=a[0];
		for(int i=1;i<a.length;i++)
		{
			sum[i]=sum[i-1]+a[i];
		}
		for(int i=0;i<a.length;i++)
		{
		System.out.print(sum[i]+" ");
	
		}
		System.out.println();
		int l=sc.nextInt();
		int r=sc.nextInt();
		if(l==0)
		{
			System.out.println(sum[r]);
		}
		else
			System.out.println(sum[r]-sum[l-1]);
		
	}	

}
