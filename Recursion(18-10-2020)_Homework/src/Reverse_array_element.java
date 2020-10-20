
public class Reverse_array_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5,6};
		reversearray(a,0);
	}
	public static void reversearray(int a[],int i)
	{
		if(i==a.length)
		{
			return;
		}
		else {
			reversearray(a,i+1);
			System.out.println(a[i]);
		}
	}

}
