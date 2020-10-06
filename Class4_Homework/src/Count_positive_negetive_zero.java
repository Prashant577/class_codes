import java.util.Scanner;

public class Count_positive_negetive_zero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int positive=0,negetive=0,zero=0;
		int a[]=new int[n];
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
		System.out.println("positive number:"+positive);
		System.out.println("negetive number:"+negetive);
		System.out.println("zero number:"+zero);
	}

}
