
public class Finf_index_from_last {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,5,8,4,3,4,5,9,3,6};
		System.out.println(lastOccur(a,0,3));
	}
	public static int lastOccur(int a[],int idx,int data)
	{
		if(idx==a.length)
		{
			return -1;
		}
		int result=lastOccur(a,idx+1,data);
		if(result!=-1)
		{
			return result;
		}
		else if(a[idx]==data)
		{
			return idx;
		}
		else
		{
			return -1;
		}
	}

}
