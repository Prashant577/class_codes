
public class Minimum_element_in_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {55,66,88,42,9,24,99,8};
		System.out.println(minNum(a,0));
	}
	public static int minNum(int a[], int i)
	{
		if(i>=a.length-1)
		{
			return a[i];
		}
		else
		{
			return Math.min(a[i], minNum(a,i+1));
		}
	}

}
