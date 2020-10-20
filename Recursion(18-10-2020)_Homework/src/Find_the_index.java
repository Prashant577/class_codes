
public class Find_the_index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,3,5,3,4,3,9,3,6,89,9};
	
		System.out.println(find(a,0,9,0));
	
	}
	public static int find(int a[],int idx, int data,int count)
	{
		if(idx==a.length)
		{
			return -1;
		}
		//int count=0;
		if(a[idx]==data)
		{
		count+=1;
		return count;
		}
		return find(a,idx+1,data,count);
		
	}

}
