
public class Pair_in_array_equal_to_target2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={5,4,3,2,1};
		targetsum(a,7);
	}
	public static void targetsum(int a[], int target)
	{
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				int sum=a[i]+a[j];
				if(sum==target)
				{
					System.out.println(a[i]+" "+a[j]);
				}
			}
		}
	}

}
