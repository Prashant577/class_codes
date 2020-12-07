import java.util.*;

public class Horizontal_vertical_path_surffing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(AllPath(1,1,3));
	}
	public static ArrayList<String> AllPath(int r,int c,int n)
	{
		if(r==n && c==n)
		{
			ArrayList<String> temp=new ArrayList<>();
			temp.add("");
			return temp;
		}
		else if(r > n || c > n)
		{
			ArrayList<String> temp=new ArrayList<>();
			return temp;
		}
		// make an arraylist for storing the resulting path
		ArrayList<String> mr=new ArrayList<>();
		//Call recurstion for horizontal path
		
		ArrayList<String> rr=AllPath(r,c+1,n);
		for(String ele:rr)
		{
			mr.add("H"+ele);
		}
		//recursion for verticle path
		rr=AllPath(r+1,c,n);
		for(String ele:rr)
		{
			mr.add("V"+ele);
		}
		//for diagonal path
		rr=AllPath(r+1,c+1,n);
		for(String ele:rr)
		{
			mr.add("D"+ele);
		}
		return mr;
	}
	

}
