import java.util.Scanner;

public class SinX_series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		double x=sc.nextInt();
		int fact=1,i,sign=-1;
		double sum;
		x=x*3.14/180; //formula for converting degree to radian.
		sum=x;
		System.out.println(x);
		for(i=3;i<=n;i=i+2)
		{
			fact=fact*i*(i-1);
			sum=sum+sign* Math.pow(x,i)/fact;
			sign=sign*-1;
			
		}
		System.out.println(sum);
	}

}
