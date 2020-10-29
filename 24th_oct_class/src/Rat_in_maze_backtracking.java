
public class Rat_in_maze_backtracking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {{1,1,0,0},{1,1,0,0},{1,1,0,0},{0,1,1,1}};
		
		
		findPath(a,4);
		
	}
	public static boolean isSafe(int a[][],int row,int col)
	{
		return(row<a.length && col<a.length && row>=0 && col>=0 && a[row][col]==1);
	}
	public static boolean findPathUtil(int a[][],int sol[][], int row, int col)
	{
		if(row==a.length-1 && col==a.length-1 && a[row][col]==1)
		{
			sol[row][col]=1;
			return true;
		}
		if(isSafe(a,row,col))
		{
			sol[row][col]=1;
			if(findPathUtil(a,sol,row+1,col))
			{
				return true;
			}
			if(findPathUtil(a,sol,row,col+1))
			{
				return true;
			}
			sol[row][col]=0; //backtracking and making the one as zero
			return false;
		}
		return false;
	}
	public static void printArray(int a[][])
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void findPath(int a[][], int n)
	{
		int solution[][]=new int[n][n];
		if(findPathUtil(a,solution,0,0))
		{
			printArray(solution);
		}
		else
		{
			System.out.println("no solution");
		}
	}

}
