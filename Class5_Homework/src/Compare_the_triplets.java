import java.util.Scanner;

public class Compare_the_triplets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int A=0;
		int B=0;
		int a[]=new int[n];
		int b[]=new int[n];
		
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			b[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
		
			if(a[i]>b[i])
			{
				A++;
			}
			else if(b[i]>a[i])
			{
				B++;
			}
			
		
		}
		System.out.println(A+" "+B);
	}

}
