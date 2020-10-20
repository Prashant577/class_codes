import java.util.Scanner;

public class Insertion_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			int j=i;
			while(j!=0 && a[j]<a[j-1])
			{
				int temp;
				temp=a[j];
				a[j]=a[j-1];
				a[j-1]=temp;
				j--;
			}
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]);
		}
	}

}
