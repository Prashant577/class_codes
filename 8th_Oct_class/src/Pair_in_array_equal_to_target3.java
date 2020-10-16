import java.util.Scanner;

public class Pair_in_array_equal_to_target3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int a[]=new int[n];
		int target=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n-1;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				int sum=a[i]+a[j];
				if(sum==target)
				{
					System.out.println("yes");
					break;
				}
			}
			
		}
		System.out.println("no");
	}

}
