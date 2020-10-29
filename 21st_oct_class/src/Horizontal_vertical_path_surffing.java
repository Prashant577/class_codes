import java.util.*;

public class Horizontal_vertical_path_surffing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3,m=3;
		System.out.println(AllPath(1,1,n,m));
	}
	public static ArrayList<String> AllPath(int r,int c,int er,int ec)
	{
		if(r==er && c==ec)
		{
			ArrayList<String> temp=new ArrayList<>();
			temp.add("");
			return temp;
		}
		else if(r > er || c > ec)
		{
			ArrayList<String> temp=new ArrayList<>();
			return temp;
		}
		// make an arraylist for storing the resulting path
		ArrayList<String> mr=new ArrayList<>();
		//Call recurstion for horizontal path
		
		ArrayList<String> rr=AllPath(r,c+1,er,ec);
		for(String ele:rr)
		{
			mr.add("H"+ele);
		}
		//recursion for verticle path
		rr=AllPath(r+1,c,er,c);
		for(String ele:rr)
		{
			mr.add("V"+ele);
		}
		//for diagonal path
		rr=AllPath(r+1,c+1,er,ec);
		for(String ele:rr)
		{
			mr.add("D"+ele);
		}
		return mr;
	}
	

}
