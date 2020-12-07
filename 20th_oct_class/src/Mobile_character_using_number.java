import java.util.ArrayList;

public class Mobile_character_using_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getkpc("23"));
	}
	public static ArrayList<String> getkpc(String str)
	{
		if(str.length()==0)
		{
			ArrayList<String> temp=new ArrayList<>();
			temp.add("");
			return temp;
		}
		char ch=str.charAt(0);
		String ros=str.substring(1);
		ArrayList<String> rr=getkpc(ros);
		ArrayList<String> mr=new ArrayList<>();
		String mc=getChoice(ch);
		for(String s:rr)
		{
			for(int i=0;i<mc.length();i++)
			{
				mr.add(mc.charAt(i) + s);
			}
		}
		return mr;
	}
	public static String getChoice(char key)
	{
		if(key=='2')
		{
			return "abc";
		}
		if(key=='3')
		{
			return "def";
		}
		if(key=='4')
		{
			return "ghi";
		}
		if(key=='5')
		{
			return "jkl";
		}
		if(key=='6')
		{
			return "mno";
		}
		if(key=='7')
		{
			return "pqr";
		}
		if(key=='8')
		{
			return "stu";
		}
		if(key=='9')
		{
			return "vxyz";
		}
		if(key=='0')
		{
			return ".;";
		}
		return "";
	}

}
