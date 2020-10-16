
public class Print_elements_in_wave_pattern_2D_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
		printwave(arr);
	}
	public static void printwave(int arr[][])
	{
		for(int j=0;j<arr[0].length;j++)
		{
			// in case of top to bottom
			if(j%2==0)
			{
				for(int i=0;i<arr.length;i++)
				{
					System.out.print(arr[i][j]+" ");
				}
			}
			else //in case of bottom to top element printing
			{
				for(int i=arr.length-1;i>=0;i--)
				{
					System.out.print(arr[i][j]+" ");
				}
			}
		}
	}

}
