
public class String_toogle_using_stringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(tooggle("abAB"));
	}
	public static String tooggle(String str)
	{
		StringBuilder sb=new StringBuilder("");
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch<='z' && ch>='a')
			{
				int temp=ch-'a'+'A';
				sb.append((char) temp);
			}
			else
			{
				int temp=ch-'A'+'a';
				sb.append((char) temp);
			}
		}
		return sb.toString();	}

}
