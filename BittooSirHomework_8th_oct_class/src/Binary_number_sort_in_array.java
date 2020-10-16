import java.util.Scanner;

public class Binary_number_sort_in_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int temp;
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int l=0;
		int r=n-1;
		while(l<r)
		{
			while(a[l]==0)
			{
				l++;
			}
			while(a[r]==1)
			{
				r--;
			}
			temp=a[l];
			a[l]=a[r];
			a[r]=temp;
			l++;
			r--;
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]);
		}
	}

}
