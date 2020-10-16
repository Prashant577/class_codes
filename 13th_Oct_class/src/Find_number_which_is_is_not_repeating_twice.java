import java.util.Scanner;

public class Find_number_which_is_is_not_repeating_twice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int ans=0;
		for(int i=0;i<n;i++)
		{
			ans=ans^a[i];
		}
		System.out.println(ans);
	}

}
