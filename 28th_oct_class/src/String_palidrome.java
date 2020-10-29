
public class String_palidrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		countcharacter("abcabca");
	}
	public static void countcharacter(String str)
	{
		int freq[]=new int[26];
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			int idx=ch-'a';
			freq[idx]++;
		}
		for(int i=0;i<26;i++)
		{
			if(freq[i]>0)
			{
				int temp='a'+i;
				char ch=(char) temp;
				System.out.println(ch+"->"+freq[i]);
			}
		}
	}

}
