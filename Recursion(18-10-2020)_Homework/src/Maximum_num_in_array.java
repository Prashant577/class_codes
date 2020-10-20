
public class Maximum_num_in_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {55,66,88,42,9,24,1,8};
		System.out.println(maxnum(a,0));
	}
	public static int maxnum(int a[],int i)
	{
		if(i>=a.length-1)
		{
			return a[i];
		}
		else
		{
		return	Math.max(a[i], maxnum(a,i+1));
		}
	}
	

}
