package DEC_5_DynamicProgramming;

public class DP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(staircase(5));
		//System.out.println(staircaseIter(5));
//		int houses[]= {6,7,1,3,8,2,4};
//		int dp[]=new int[100];
//		int n=houses.length;
//		//System.out.println(theift(hval,n-1,dp));
//		System.out.println(maxlootIterative(houses));
//		int dp[][]=new int[100][100];
//		System.out.println(countpath(2,2,dp));
		int weight[]= {2,3,1,4};
		int value[]= {4,5,3,7};
		int capacity=5;
		System.out.println(knapSack01(weight,value,capacity,0));
	}
	public static int staircase(int n)
	{
		if(n==0)
		{
			return 1;
		}
		if(n==1)
		{
			return 1;
		}
		if(n==2)
		{
			return 2;
		}
		return staircase(n-1) + staircase(n-2) + staircase(n-3);
	}
	
	public static int staircaseIter(int n)
	{
		int[] qb=new int[n+3];
		qb[0]=1;
		qb[1]=1;
		qb[2]=2;
		for(int i=3;i<=n;i++)
		{
			qb[i]=qb[i-1] + qb[i-2] + qb[i-3];
		}
		return qb[n];
	}
	
	public static int theift(int hval[], int index,int dp[])
	{
		if(index==0)
		{
			return hval[0];
		}
		if(index==1)
		{
			return Math.max(hval[0], hval[1]);
		}
		if(dp[index]!=0)
		{
			return dp[index];
		}
		else
		{
			int ans=Math.max(hval[index]+theift(hval,index-2,dp), theift(hval,index-1,dp));
			dp[index]=ans;
			return ans;
		}
		
		
	}
	
	public static int maxlootIterative(int houses[])
	{
		int dp[]=new int[100];
		dp[0]=houses[0];
		dp[1]=Math.max(houses[0], houses[1]);
		for(int i=2;i<houses.length;i++)
		{
			dp[i]=Math.max(dp[i-1], dp[i-2]+houses[i]);
		}
		return dp[houses.length-1];
	}
	
	public static int countpath(int x,int y,int dp[][])
	{
		if(x==0 && y==0)
		{
			return 1;
		}
		else if(x<0 || y<0)
		{
			return 0;
		}
		if(dp[x][y]!=0)
		{
			return dp[x][y];
		}
		else
		{
			dp[x][y]=countpath(x-1,y,dp) + countpath(y-1,x,dp);
			return dp[x][y];
		}
	}
	
//	public static int countpathIterative(int m,int n)
//	{
//		int dp[][]=new int[100][100];
//		for(int i=0;i<m;i++)
//		{
//			
//		}
//	}
	
	public static int knapSack01(int[] weight,int[] value,int capacity,int index){
	    //capacity is zero
	    if(capacity == 0){
	        return 0;
	    }
	    // index == length
	    if(index >= weight.length) {
	        return 0;
	    }
	    // capacity < weight
	    if(capacity < weight[index]){
	        int ans = knapSack01(weight,value,capacity,index+1);
	        return ans;
	    }
	    // scenario include me
	    int ans1 = knapSack01(weight,value,capacity-weight[index],index+1) + value[index];
	    // scenaio do not include me
	    int ans2 = knapSack01(weight,value,capacity,index+1);
	    // my ans
	    int ans = Math.max(ans1,ans2);
	    return ans;
	}

}
