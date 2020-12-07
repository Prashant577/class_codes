import java.util.ArrayList;

public class Print_path_using_only_horizontal_verticle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(printPath1(1,1,3));
	}
	public static ArrayList<String> printPath1(int row,int col,int n)
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
		ArrayList<String> rr= printPath1(row,col+1,n);
		for(String s:rr)
		{
			mr.add('H'+s);
		}
		rr=printPath1(row+1,col,n);
		for(String s:rr)
		{
			mr.add('V'+s);
		}
		
		
		return mr;
	}

}
