
public class Subset_element_target {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {3,34,4,12,5,2};
		subset(a,0,0,9," ");
	}
	public static void subset(int a[],int idx,int csum,int target,String ans)
	{
		if(idx==a.length)
		{
			if(csum==target)
			{
				System.out.println(ans);
			}
			return;
		}
		if(csum>target)
		{
			return;
		}
		subset(a,idx+1,csum+a[idx],target,ans+a[idx]+" ");
		subset(a,idx+1,csum,target,ans);
	}

}
