import java.util.Scanner;

public class Better_version_of_maximum_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println(btrMax(a,0));
	}
	public static int btrMax(int a[],int idx)
	{
		if(idx==a.length-1)
		{
			return a[idx];
		}
		int max=btrMax(a,idx+1);
		{
			if(max>a[idx])
			{
				return max;
			}
			else
			{
				return a[idx];
			}
		}
	}

}
