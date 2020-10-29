
public class String_compression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(compression("aaabbabbbaccd"));
	}
	public static String compression(String str)
	{
		int count=0;
		StringBuilder sb=new StringBuilder("");
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(i!=str.length()-1)
			{
				char chn=str.charAt(i+1);
				if(ch==chn)
				{
					count++;
				}
				else
				{
					sb.append(ch+""+(count+1));
					count=0;
				}
			}
			else
			{
				sb.append(ch+""+(count+1));
			}
		}
		return sb.toString();
	}

}
