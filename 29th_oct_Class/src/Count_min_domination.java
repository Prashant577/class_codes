
public class Count_min_domination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,5,7,10,15};
		System.out.println(denomination(a,10,0));
	}
	public static int denomination(int a[], int target, int idx)
	{
		if(target==0)
		{
			return 1;
		}
		if(target<0)
		{
			return 0;
		}
		int count=0;
		for(int i=idx;i<a.length;i++)
		{
			count+=denomination(a,target-a[i],i);
		}
		return count;
	}

}
