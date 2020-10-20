
public class Match_number_inArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,20,50,55};
		System.out.println(findfirstindex(a,0,50));
	}
	public static int findfirstindex(int a[], int idx, int data)
	{
		if(idx==a.length)
		{
			return -1;
		}
		if(a[idx]==data)
		{
			return idx;
		}
	return findfirstindex(a,idx+1,data);
	}
	

}
