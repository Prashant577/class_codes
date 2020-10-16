import java.util.Scanner;

public class Reverse_of_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int temp;
		int start=0;
		int end=n-1;
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		while(start<end) {
		temp=a[start];
		a[start]=a[end];
		a[end]=temp;
		start++;
		end--;
		
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}
