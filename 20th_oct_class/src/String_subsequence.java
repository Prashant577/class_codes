import java.util.ArrayList;

import javax.print.DocFlavor.STRING;

public class String_subsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getSS("abc"));
	}
	public static ArrayList<String> getSS(String str)
	{
		if(str.length()==0)
		{
			ArrayList<String> toReturn = new ArrayList<>();
			toReturn.add("");
			return toReturn;
		}
		char ch=str.charAt(0);
		String ros=str.substring(1);
		ArrayList<String> rr= getSS(ros);
		ArrayList<String> myresult= new ArrayList<>();
		for(String s:rr)
		{
			myresult.add(s);
			myresult.add(ch+s);
		}
		return myresult;
	}
	

}
