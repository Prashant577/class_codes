import java.util.HashSet;

public class Similar_numbers_in_two_arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a1= {1,2,3,4,6};
		int[] a2= {1,2,3,7};
		commonElements(a1,a2);
		

	}
	
	public static void commonElements(int[] a1, int[] a2)
	{
		HashSet<Integer> hset=new HashSet<>();
		for(int i=0;i<a1.length;i++)
		{
			for(int j=0;j<a2.length;j++)
			{
				if(a1[i]==a2[j])
				{
					hset.add(a1[i]);
					break;
				}
			}
		}
		for(int i:hset)
		{
			System.out.println(i);
		}
	}
	

}
