import java.util.Scanner;

public class Display_Smallest_and_Largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int max,least;
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		max=least=a[0];
		for(int i=1;i<n;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
			if(a[i]<least)
			{
				least=a[i];
			}
			
		}
		System.out.println("largest num"+max);
		System.out.println("smallest num"+least);
	}

}
