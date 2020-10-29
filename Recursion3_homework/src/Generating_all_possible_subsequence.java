import java.util.*;
public class Generating_all_possible_subsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Subsequence("123"));
	}
	public static ArrayList<String> Subsequence(String str)
	{
		if(str.length()==0)
		{
			ArrayList<String> temp=new ArrayList<>();
			temp.add(" ");
			return temp;
		}
		char ch= str.charAt(0);
		String ros= str.substring(1);
		ArrayList<String> rr=Subsequence(ros);
		ArrayList<String> mr=new ArrayList<>();
		for(String s:rr)
		{
			mr.add(s);
			mr.add(ch+s);
		}
		return mr;
	}

}
