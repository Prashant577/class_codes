
public class String_palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("malayalam");
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

}
