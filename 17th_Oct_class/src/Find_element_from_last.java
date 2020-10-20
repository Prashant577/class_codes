
public class Find_element_from_last {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2, 5 , 8, 9 , 5 , 3};
		
		int sum=findfromlast(a,0,5);
		System.out.println(sum);
		
	}
	public static int findfromlast(int a[],int idx, int data)
	{
		if(idx==a.length)
		{
			return -1;
		}
		int result=findfromlast(a,idx+1,data);
		if(result!=-1)
		{
			return result;
		}
		else
			{
			if(a[idx]==data)
			{
				
				return idx;
			}
			else
			{
				return -1;
			}
			
		}
		
	}

}
