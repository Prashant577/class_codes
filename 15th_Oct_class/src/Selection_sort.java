import java.util.Scanner;

public class Selection_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n-1;i++)
		{
			int min=a[i];
			int minindex=i;
			for(int j=i+1;j<n;j++)
			{
				if(a[j]<min)
				{
					min=a[j];
					minindex=j;
				}
			}
			int temp;
			temp=a[i];
			a[i]=a[minindex];
			a[minindex]=temp;
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		
	}

}
