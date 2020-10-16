import java.util.Scanner;

public class Two_pointer_approach_for_target_sum_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int target=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int l,r;
		l=0;
		r=n-1;
		while(l<r)
		{
			int cursum=a[l]+a[r];
			if(cursum==target)
			{
				System.out.println(l+" "+r);
				return;
			}
			else if(cursum<target)
			{
				l++;
			}
			else
			{
				r--;
			}
		}
	}

}
