
public class Min_number_in_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,20,30,50,100};
		System.out.println(min(a,0));
	}
	public static int min(int a[],int idx)
	{
		if(idx==a.length-1)
		{
			return a[idx];
		}
		int minofrest=min(a,idx+1);
		if(minofrest<a[idx])
		{
			return minofrest;
		}
		else
		{
			return a[idx];
		}
	}

}
