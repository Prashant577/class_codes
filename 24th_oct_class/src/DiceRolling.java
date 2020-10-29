
public class DiceRolling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printpattern(1,4,"");
	}
	public static void printpattern(int ques,int n, String ans)
	{
		if(ques==n)
		{
			System.out.println(ans+"-"+n);
			return;
		}
		if(ques>n)
		{
			return;
		}
		for(int i=1;i<=6;i++)
		{
			printpattern(ques+i,n,ans+"-"+ques); 
		}
	}

}
