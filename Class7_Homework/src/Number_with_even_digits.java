import java.util.Scanner;

public class Number_with_even_digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		
		int sum=0;
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			
		int count=0;
		while(a[i]!=0)
		{
		
			a[i]/=10;
			
			count=count+1;
			
		  }
		
		if(count%2==0)
		{
			sum++;
		}
		}
	System.out.println(sum);	
	}

}
