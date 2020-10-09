import java.util.Scanner;

public class Diagonal_Difference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[][]=new int[n][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		int sum=0;
		int sum1=0;
		int result;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==j)
			{
				sum=sum+a[i][j];
				
			}
			if((i+j)==(n-1))
			{
				sum1=sum1+a[i][j];
			}
			}
		}
		result=sum-sum1;
		result=(int)Math.abs(result);
		System.out.println(result);
	}

}
