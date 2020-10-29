
public class String_Permutation_using_ques_ans {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		permutation("abc","");
	}
	public static void permutation(String ques,String ans)
	{
		if(ques.equals(""))
		{
			System.out.println(ans);
			return;
		}
		
		for(int i=0;i<ques.length();i++)
		{
			permutation(ques.substring(0,i)+ques.substring(i+1),ans+ques.charAt(i));
		}
	}

}
