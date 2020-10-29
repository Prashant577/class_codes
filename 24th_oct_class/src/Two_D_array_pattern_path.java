
public class Two_D_array_pattern_path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pathpattern(1,1,3,"");
	}
	public static void pathpattern(int r,int c,int n,String ans)
	{
		if(r==n && c==n)
		{
			System.out.println(ans);
			return;
		}
		if(r>n || c>n)
		{
			return;
		}
		pathpattern(r,c+1,n,ans+"H");
		pathpattern(r+1,c,n,ans+"V");
		pathpattern(r+1,c+1,n,ans+"D");
	}

}
