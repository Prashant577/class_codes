import java.util.Scanner;

public class Series_of_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		double sum=(double)0.0;
		for(int i=1;i<=n;i++)
		{
			sum=sum+(double)1/(double)i;
		}
		System.out.println(sum);
	}

}
