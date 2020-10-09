import java.util.Scanner;

public class Max_Min_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int max,min;
		
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			
		}
		max=min=a[0];
		for(int i=1;i<n;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println(max+""+min);
		
	}

}
