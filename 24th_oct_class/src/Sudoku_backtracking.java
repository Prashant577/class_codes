

public class Sudoku_backtracking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner sc=new Scanner(System.in);
		//int n=sc.nextInt();
		//int a[][]=new int[n][n];
//		for(int i=0;i<a.length;i++)
//		{
//			for(int j=0;j<a[0].length;j++)
//			{
//				a[i][j]=sc.nextInt();
//			}
//		}
		int a[][]= {{3,0,6,5,0,8,4,0,0},{5,2,0,0,0,0,0,0,0},{0,8,7,0,0,0,0,3,1},{0,0,9,0,1,0,0,8,0},{9,0,0,8,6,3,0,0,5},{0,5,0,0,9,0,6,0,0},{1,2,0,0,0,0,2,5,0},{0,0,0,0,0,0,0,7,4},{0,0,5,2,0,6,3,0,0}};
		sudoku(a,0,0);
	}
	public static void display(int a[][])
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void sudoku(int a[][], int i, int j)
	{
		//base case
		if(i==a.length)
		{
			display(a);
			return;
		}
		int ni=0; //end of i  i.e row
		int nj=0; //end of j  i.e coloumn
		if(j==a[0].length-1)
		{
			ni=i+1;
			nj=0;
		}
		else
		{
			ni=i;
			nj=j+1;
		}
		if(a[i][j]!=0)
		{
			sudoku(a,ni,nj);
		}
		else
		{
			for(int po=1;po<=9;po++)
			{
				if(isValid(a,i,j,po)==true)
				{
					a[i][j]=po;
					sudoku(a,ni,nj);
					a[i][j]=0;
				}
			}
		}
	}
	public static boolean isValid(int a[][], int x,int y, int val)
	{
		for(int j=0;j<a[0].length;j++)
		{
			if(a[x][y]==val)
			{
				return false;
			}
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[x][y]==val)
			{
				return false;
			}
		}
		//for checking the number repeated in 3*3 matrix
		int mi=x/3*3; 
		int mj=y/3*3;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(a[mi+i][mj+j]==val)
				{
					return false;
				}
			}
		}
		return true;
		
	}

}
