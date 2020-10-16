
public class Number_smaller_than_current_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {8,1,2,2,3};
		int output[]=new int[a.length];
		int i,j;
		for(i=0;i<a.length;i++)
		{
			System.out.println(i);
			int count=0;
			for(j=0;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					count++;
					
				}
			}
			output[i]=count;
		}
		for(i=0;i<output.length;i++)
		System.out.println(output[i]);
	}

}
