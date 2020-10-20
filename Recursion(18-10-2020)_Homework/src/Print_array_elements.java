
public class Print_array_elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {55,66,88,42,9,24,99,};
		printarray(a,0);
		
		
	}
	public static void printarray(int a[], int i)
	{
		if(i==a.length)
		{
			return;
			
	    }
		
		
		System.out.println(a[i]);
		printarray(a,i+1);	

		
		
		
	}

}
