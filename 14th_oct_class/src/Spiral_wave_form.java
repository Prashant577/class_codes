
public class Spiral_wave_form {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int	a[][]= {{1,2,3},{4,5,6},{7,8,9}};
		spiralwave(a);
	}
	public static void spiralwave(int a[][])
	{
		
		int startrow=0;
		int endrow=a.length-1;
		int startcol=0;
		int endcol=a[0].length-1;
		while(startrow<=endrow && startcol<=endcol) {
		for(int i=startcol;i<=endcol;i++)
		{
			System.out.println(a[startrow][i]);
		}
		startrow++;
		if(startrow<=endrow && startcol<=endcol) {
		for(int i=startrow;i<=endrow;i++)
		{
			System.out.println(a[i][endcol]);
		}
		endcol--;
		}
		if(startrow<=endrow && startcol<=endcol) {
		for(int i=endcol;i>=startcol;i--)
		{
			System.out.println(a[endrow][i]);
		}
		endrow--;
		}
		if(startrow<=endrow && startcol<=endcol) {
		for(int i=endrow;i>=startrow;i--)
		{
			System.out.println(a[i][startcol]);
		}
		startcol++;
		}
	}
	}

}
