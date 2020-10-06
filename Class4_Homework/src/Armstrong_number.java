import java.util.Scanner;

public class Armstrong_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int n1,rem,sum=0;
		n1=n;
		while(n1!=0)
		{
			rem=n1%10;
			sum=sum+(rem*rem*rem);
			n1=n1/10;
		}
		if(n==sum)
		{
			System.out.println("armstrong number");
		}
		else
		{
			System.out.println("not an armstrong number");
		}
	}

}
