import java.util.Scanner;

public class Trapping_water_problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int lmax[]=new int[n];
		int rmax[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		lmax[0]=a[0];
		for(int i=1;i<n;i++)
		{
			lmax[i]=Math.max(lmax[i-1], a[i]);
		}
		rmax[n-1]=a[n-1];
		for(int i=n-2;i>=0;i--)
		{
			rmax[i]=Math.max(rmax[i+1], a[i]);
		}
		int ans=0;
		for(int i=0;i<n;i++)
		{
			int minwall=Math.min(lmax[i], rmax[i]);
			if(minwall>a[i])
			{
				ans+=minwall-a[i];
			}
		}
		System.out.println(ans);
	}

}
