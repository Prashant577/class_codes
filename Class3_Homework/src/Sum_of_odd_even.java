import java.util.Scanner;

public class Sum_of_odd_even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int even=0;
		int odd=0;
		int a[]=new int[num];
		for(int i=0;i<num;i++)
		{
			a[i]=sc.nextInt();
		if(a[i]%2==0)
		{
			even=even+a[i];
		}
		else
		{
			odd=odd+a[i];
		}
		}
		System.out.println(even+" "+odd);
	}

}
