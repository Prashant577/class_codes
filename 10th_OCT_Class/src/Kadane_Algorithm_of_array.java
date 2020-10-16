import java.util.Scanner;

public class Kadane_Algorithm_of_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int a[]= {-2,1,-3,4,-1,2,1-5,4};
		int Csum=0;
		int maxsum=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++)
		{
			Csum=Csum+a[i];
			if(Csum<0)
			{
				Csum=0;
			}
			maxsum=Math.max(maxsum,Csum);
			
		}
		System.out.println(maxsum);
		
	}

}
