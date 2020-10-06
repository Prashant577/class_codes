import java.util.Scanner;

public class Sum_of_digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		int a;
		while(n!=0)
		{
			a=n%10;
			sum=sum+a;
			n=n/10;
		}
		System.out.println(sum);
	}

}
