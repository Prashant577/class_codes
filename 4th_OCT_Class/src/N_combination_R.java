import java.util.Scanner;

public class N_combination_R {
public static int fact(int n)   //function "fact" is used so that we don't have right same code again n again
{
	int factorial=1;
	for(int i=1;i<=n;i++)
	{
		factorial=factorial*i;
	}
	return factorial;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int r=sc.nextInt();
		int nfact=fact(n);
		int rfact=fact(r);
		int nrfact=fact(n-r);
		int result=(nfact)/(rfact*nrfact);
		System.out.println(result);
	}

}
