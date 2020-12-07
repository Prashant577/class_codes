import java.util.ArrayList;

public class Print_all_path_with_diagonal_restriction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(printPath(1,1,3));
	}
	protected static ArrayList<String> printPath(int row,int col,int n)
	{
		if(row==n && col==n)
		{
			ArrayList<String> temp=new ArrayList<>();
			temp.add("");
			return temp;
		}
		if(row>n || col>n)
		{
			ArrayList<String> temp=new ArrayList<>();
			return temp;
		}
		ArrayList<String> mr=new ArrayList<>();
		ArrayList<String> rr= printPath(row,col+1,n);
		for(String s:rr)
		{
			mr.add('H'+s);
		}
		rr=printPath(row+1,col,n);
		for(String s:rr)
		{
			mr.add('V'+s);
		}
		
		rr=printPath(row+1,col+1,n);
		for(String s:rr)
		{
			mr.add('D'+s);
		}
		return mr;
	}

}
