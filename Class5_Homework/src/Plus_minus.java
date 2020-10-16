import java.util.Scanner;

public class Plus_minus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		float positive=0;
		float negetive=0;
		float zero=0;
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			if(a[i]>0)
			{
				positive++;
			}
			else if(a[i]<0)
			{
				negetive++;
				
			}
			else
			{
				zero++;
			}
		}
		System.out.println(String.format("%.6f",positive/n));
		System.out.println(String.format("%.6f",negetive/n));
		System.out.println(String.format("%.6f",zero/n));
		
	}

}
