
public class Print_array_recursively {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {5,4,3,2,1};
		printarray(a,0);
	}
	public static void printarray(int a[], int idx)
	{
		if(idx==a.length)
		{
			return;
		}
		printarray(a,idx+1);
		System.out.println(a[idx]);
	}

}
