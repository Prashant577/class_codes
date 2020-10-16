import java.util.Scanner;

public class Reverse_array_without_temp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
	
		for(int i=0;i<a.length;i++ )
		{
			a[i]=sc.nextInt();
		}
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.print(a[i]+" ");
		}
	}

}
