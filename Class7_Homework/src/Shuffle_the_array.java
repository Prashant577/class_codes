import java.util.Scanner;

public class Shuffle_the_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int index=0;
	
		int result[]=new int[n];
		int x,y;
		x=0;
		y=n/2;
		int i=0;
		for( i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		while(x<n/2)
		{
			result[index++]=a[x++];
			result[index++]=a[y++];
		}
		for(i=0;i<n;i++)
		{
			System.out.print(result[i]+" ");
		}
	
	}

}
