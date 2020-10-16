
public class NumberWithEvenDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,176,2,7,5546};
		int even=0;
		for(int i=0;i<a.length;i++)
		{
			int count=0;
			while(a[i]!=0)
			{
				a[i]/=10;
				count++;
			}
			if(count%2==0)
			{
				even++;
			}
		}
		System.out.println(even);
	}

}
