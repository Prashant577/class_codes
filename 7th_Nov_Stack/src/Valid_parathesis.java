import java.util.Scanner;
import java.util.Stack;

public class Valid_parathesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println(isValidParathesis(s));

	}
	public static boolean isValidParathesis(String s)
	{
		Stack<String> st=new Stack<>();
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='[')
			{
				st.push(s.charAt(i)+"");
			}
			else
			{
				String currchar=s.charAt(i)+"";
				if(st.empty())
				{
					return false;
				}
				else
				{
					String top=st.pop();
				//	if((top.equals("(") && currchar.equals(")) || (top.equals("{") && currchar.equals("}"))
				//	|| (top.equals("[") && currchar.equals("]")))
					if((top.equals("(") && currchar.equals(")")) || (top.equals("{") && currchar.equals("}")) || (top.equals("[") && currchar.equals("]")))
					{
						continue;
					}
					else
					{
						return false;
					}
				}
			}
		}
		if(st.size()==0)
		{
			return true;
		}
		else {
			return false;
		}
	}

}
