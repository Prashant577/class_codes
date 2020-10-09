import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int temp;
		int start=0;
		int end=n-1;
		while(start<end)
		{
			temp=a[start];
			a[start]=a[end];
			a[end]=temp;
			start++;
			end--;
		}
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
	}

}
