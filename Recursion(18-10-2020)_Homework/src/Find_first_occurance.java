
public class Find_first_occurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {5,3,5,4,1,2,3,8,6};
		System.out.println(firstOccur(a,0,8));
	}
	public static int firstOccur(int a[], int idx, int data)
	{
		if(idx==a.length)
		{
			return -1;
		}
		if(a[idx]==data)
		{
			return idx;
		}
		return firstOccur(a,idx+1,data);
		
	}

}
