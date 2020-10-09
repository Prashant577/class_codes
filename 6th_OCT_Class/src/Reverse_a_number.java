import java.util.Scanner;

public class Reverse_a_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int rev,sum=0;
		boolean negetive=false;
		if(n<0)
		{
			negetive=true;
			n=n*(-1);
			
		}
		while(n>0)
		{
			rev=n%10;
			sum=sum*10+rev;
			n=n/10;
		}
		if(negetive==true)
		{
			sum=sum*(-1);
		}
		System.out.println(sum);
	}

}
