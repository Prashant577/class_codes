import java.util.Scanner;

public class Big_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long ar[]=new long[n];
		long sum=0;
		for(int i=0;i<n;i++)
		{
			ar[i]=sc.nextLong();
			sum=sum+ar[i];
		}
		System.out.println(sum);
	}

}
