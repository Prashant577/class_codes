
public class Reverse_wave_in_2D_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int	a[][]= {{1,2,3},{4,5,6},{7,8,9}};
	reversewave(a);
	}
	public static void reversewave(int a[][])
	{
		boolean flag=false;
		for(int j=a[0].length-1;j>=0;j--)
		{
			if(flag==false)
			{
				for(int i=0;i<a.length;i++)
				{
					System.out.print(a[i][j]+" ");
				}
				flag=true;
			}
			else
			{
				for(int i=a.length-1;i>=0;i--)
				{
					System.out.print(a[i][j]+" ");
				}
				flag=false;
			}
		}
	}

}
