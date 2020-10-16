import java.util.Scanner;

public class Array_addition_on_the_basis_of_index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a[]= {1,2,3,4,5};
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int sum=0;
		for(int i=n1;i<=n2;i++)
		{
			sum=sum+a[i];
		}
		System.out.println(sum);
	}

}
