
public class PrintAllPalindromicSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		palindromeSubstring("geek");
	}
	public static boolean ispalindrome(String str)
	{
		int l=0;
		int r=str.length()-1;
		while(l<=r)
		{
			char leftch=str.charAt(l);
			char rightch=str.charAt(r);
			if(leftch==rightch)
			{
				l++;
				r--;
			}
			else
			{
				return false;
			}
		}
		return true;
	}
	public static void palindromeSubstring(String str)
	{
		for(int i=0;i<str.length();i++)
		{
			for(int j=i;j<str.length();j++)
			{
				String curSubString=str.substring(i,j+1);
				if(ispalindrome(curSubString)==true)
				{
					System.out.println(curSubString);
				}
			}
		}
	}

}
