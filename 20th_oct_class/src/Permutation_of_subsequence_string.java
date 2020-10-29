import java.util.ArrayList;

public class Permutation_of_subsequence_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(permutation("abc"));
	}
	public static ArrayList<String> permutation(String str)
	{
		if(str.length()==0)
		{
			ArrayList<String> temp=new ArrayList<>();
			temp.add("");
			return temp;
	}
		char ch=str.charAt(0);
		String ros=str.substring(1);
		ArrayList<String> rr=permutation(ros);
		ArrayList<String> mr=new ArrayList<>();
		for(String s:rr)
		{
			for(int i=0;i<=s.length();i++)
			{
				String prefix=s.substring(0,i);
				String suffix=s.substring(i);
				mr.add(prefix+ch+suffix);
			}
		}
		return mr;
	}

}
