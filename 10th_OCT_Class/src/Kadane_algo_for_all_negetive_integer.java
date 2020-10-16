import java.util.Scanner;

public class Kadane_algo_for_all_negetive_integer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a[]= {-2,-3,-5};
		int csum=0;
		boolean positive=false;
		int max=Integer.MIN_VALUE;
		int maxsum=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++)
		{
			csum=csum+a[i];
			if(csum<0)
			{
				csum=0;
			}
			if(csum>0)
			{
				positive=true;
			}
			maxsum=Math.max(maxsum, csum);
			max=Math.max(max, a[i]);
		}
		if(positive==false)
		{
			System.out.println(max);
		}
		System.out.println(maxsum);
	}

}
