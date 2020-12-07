
public class Minimum_coins_to_reach_target {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,5,7,10,15};
		System.out.println(mincoinReq(a,16));
	}
	public static int mincoinReq(int a[], int target)
	{
		if(target==0)
		{
			return 0;
		}
		if(target<0)
		{
			return 100000002;
		}
		int mincoin=100000002;
		for(int i=0;i<a.length;i++)
		{
			mincoin=Math.min(mincoin,mincoinReq(a,target-a[i]));
		}
		return mincoin+1;
	}

}
