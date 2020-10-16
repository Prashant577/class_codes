import java.util.Scanner;

public class Majority_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int count=0;
		int i,j;
		for( i=0;i<n;i++)
		{
			
			a[i]=sc.nextInt();
		}
		
		for( i=0;i<n;i++)
		{
			count=0;
			for( j=i;j<n;j++)
			{
				if(a[j]==a[i])
				{
					count=count+1;
				}
			
			
			}
			if(count>n/2)
			{
				System.out.println(count);
				return;
		}
		}
		
	
		
	}

}
