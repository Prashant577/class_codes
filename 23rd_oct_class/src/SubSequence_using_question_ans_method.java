
public class SubSequence_using_question_ans_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abc";
		subsequence(s,"");
	}
	public static void subsequence(String ques, String ans)
	{
		if(ques.equals(""))   //ques.equals is similar to ques=="";
		{
			System.out.println(ans);
			return;
		}
		subsequence(ques.substring(1), ans+ques.charAt(0)); 
		subsequence(ques.substring(1), ans);
		
		
		return;
	}

}
