import java.util.Scanner;

public class Array_Manipulation_Brute_force_algo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		long ar[]=new long[a+1];
		for(int i=1;i<a+1;i++)
		{
			ar[i]=sc.nextInt();
		}
		for(int i=0;i<b;i++)
		{
			int p,q,r;
			p=sc.nextInt();
			q=sc.nextInt();
			r=sc.nextInt();
			ar[p]=ar[p]+r;
			if(q+1<=a)
			ar[q+1]=ar[q+1]-r;
		}
		for(int i=1;i<a;i++)
		{
			ar[i]=ar[i]+ar[i-1];
		}
		long max=ar[0];
		for(int i=1;i<a;i++)
		{
			max=Math.max(max, ar[i]);
		}
		System.out.println(max);
	}

}
