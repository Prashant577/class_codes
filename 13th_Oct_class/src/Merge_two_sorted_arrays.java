import java.util.Scanner;

public class Merge_two_sorted_arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int a[]=new int[n1];
		int b[]=new int[n2]; 
		int merge[]=new int[n1+n2]; // int merge[]=new int
		
		for(int i=0;i<n1;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n2;i++)
		{
			b[i]=sc.nextInt();
		}
		int p,q,r;
		p=0; //it will point to 1st array
		q=0; //it will point to 2nd array
		r=0;
		while(p<n1 && q<n2)
		{
			if(a[p]<b[q])
			{
				merge[r++]=a[p++];
			}
			else
			{
				merge[r++]=b[q++];
			}
		}
		while(p<n1)
		{
			merge[r++]=a[p++];
		}
		while(q<n2)
		{
			merge[r++]=b[q++];
		}
		for(int i=0;i<n1+n2;i++)
		{
			System.out.print(merge[i]+" ");
		}
	}

}
