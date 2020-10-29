import java.util.ArrayList;

public class Snake_ladder_problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Snake(1,10));
	}
	public static ArrayList<String> Snake(int start, int end)
	{ 
		if(start==end)
	{
			ArrayList<String> temp=new ArrayList<>();
			temp.add(Integer.toString(end));
			return temp;
	}
	if(start>end)
	{
		ArrayList<String> temp=new ArrayList<>();
		//temp.add("");
		return temp;
		
	}
		ArrayList<String> myresult=new ArrayList<>();
		for(int i=1;i<=6;i++)
		{
			ArrayList<String> recurResult=Snake(start +i,end);
			for(String s:recurResult)
			{
				myresult.add(start+"-"+s);
			}
		}
		return myresult;
	}

}
