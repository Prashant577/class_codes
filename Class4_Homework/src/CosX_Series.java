import java.util.Scanner;

public class CosX_Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		double x=sc.nextDouble();
		int fact=1,i,sign=-1;
		double sum;
		x=x*3.14/180;
		sum=1;
		for(i=2;i<=n;i=i+2)
		{
			fact=fact*i*(i-1);
			sum=sum+(Math.pow(x, 2))/fact;
			sign=sign*-1;
		}
		System.out.println(sum);
	}

}
