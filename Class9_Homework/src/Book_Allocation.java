
public class Book_Allocation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,20,30,40};
		int k=2;
		AllocateBooks(a,k);
	}
	public static void AllocateBooks(int a[], int k)
	{
		
		int low=getMax(a);
		int hi=getSum(a);
		int minTime=Integer.MAX_VALUE;
		while(low<=hi)
		{
			int mid=low+(hi-low)/2;
			int studentcount=numberofstudents(a,a.length,mid);
			if(studentcount>k)
			{
				low=mid+1;
			}
			else
			{
				minTime=mid;
				hi=mid-1;
			}
		}
		System.out.println(minTime);
	}
	public static int numberofstudents(int a[], int n, int maxlen)
	{
		int totalsum=0;
		int numofStudents=1;
		for(int i=0;i<a.length;i++)
		{
			totalsum+=a[i];
			if(totalsum>maxlen) //maxlen is the mid value
			{
				totalsum=a[i];
				numofStudents++;
			}
		}
		return numofStudents;
	}
	public static int getSum(int a[])
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i];
		}
		return sum;
	}
	public static int getMax(int a[])
	{
		int max=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++)
		{
			max=Math.max(max, a[i]);
		}
		return max;
		
	}

}
