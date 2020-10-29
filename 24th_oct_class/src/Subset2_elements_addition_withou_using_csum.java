
public class Subset2_elements_addition_withou_using_csum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {3,34,4,12,5,2};
		subset2(a,0,9," ");
	}
	public static void subset2(int a[],int idx,int target,String ans)
	{
		if(idx==a.length)
		{
			if(target==0)
			{
				System.out.println(ans);
			}
			return;
		}
		if(target<0)
		{
			return;
		}
		subset2(a,idx+1,target-a[idx],ans+a[idx]+" ");
		subset2(a,idx+1,target,ans);
	}

}
